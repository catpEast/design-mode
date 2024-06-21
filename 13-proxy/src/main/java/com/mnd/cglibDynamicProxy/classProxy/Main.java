package com.mnd.cglibDynamicProxy.classProxy;

import com.mnd.order.IOrderService;
import com.mnd.order.OrderService;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author wyz
 * @Date 2024/6/14 16:28
 * @Description 代理类
 */
public class Main {

    public static void main(String[] args) {
        // 保存CGLIB生成的字节码文件
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, Main.class.getResource("").getPath());

        String orderNo = "1001";
        IOrderService orderService = new OrderService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(IOrderService.class);
        enhancer.setCallback(new OrderServiceClassProxyInterceptor(orderService));
        IOrderService cglibProxy = (IOrderService) enhancer.create();
        
        cglibProxy.add(orderNo);
        cglibProxy.delete(orderNo);
        cglibProxy.modify(orderNo);
        cglibProxy.delete(orderNo);
    }
}
