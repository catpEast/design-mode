package com.mnd.cglibDynamicProxy.classProxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Author wyz
 * @Date 2024/6/14 16:28
 * @Description CGLIB动态代理的MethodInterceptor实现
 */
public class OrderServiceClassProxyInterceptor implements MethodInterceptor {

    private Object target;
    
    public OrderServiceClassProxyInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        
        methodProxy.invoke(target, args);   // 将target转换为OrderService，调用add/delete等方法
        
//        methodProxy.invokeSuper(proxy, args);   // 将proxy转换为OrderService的代理对象，调用CGLIB$add$0等方法
        long end = System.currentTimeMillis();
        System.out.println("CGLIB动态代理 >>> " + (end - start) + "ms");
     
        return null;
    }
}
