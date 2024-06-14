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
        Object result = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("CGLIB动态代理 >>> " + (end - start) + "ms");
        // methodProxy.invoke();
        
        return result;
    }
}
