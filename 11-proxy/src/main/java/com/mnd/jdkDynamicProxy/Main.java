package com.mnd.jdkDynamicProxy;

import com.mnd.order.IOrderService;
import com.mnd.order.OrderService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;
import sun.misc.ProxyGenerator;

/**
 * @Author wyz
 * @Date 2024/6/14 15:20
 * @Description JDK动态代理，只能代理接口
 */
public class Main {

    public static void main(String[] args) {
        String orderNo = "10012";
        IOrderService orderService = new OrderService();

        IOrderService jdkProxy = (IOrderService) Proxy.newProxyInstance(
            IOrderService.class.getClassLoader(),
            new Class[] {IOrderService.class},
            new OrderServiceInvocationHandler(orderService));

        jdkProxy.add(orderNo);
        jdkProxy.delete(orderNo);
        jdkProxy.modify(orderNo);
        jdkProxy.query(orderNo);

        // 保存JDK动态代理生成的class文件
        saveProxyClass();
    }

    // 保存class文件到当前目录下
    public static void saveProxyClass() {
        String path = Main.class.getResource("").getPath();
        String className = "$ProxyOrderService";
        byte[] classFile = ProxyGenerator.generateProxyClass(className, new Class[] {IOrderService.class});
        
        try (FileOutputStream out = new FileOutputStream(
            path + File.separator + className + ".class")) {
            out.write(classFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
