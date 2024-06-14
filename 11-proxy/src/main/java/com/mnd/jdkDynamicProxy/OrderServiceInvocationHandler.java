package com.mnd.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author wyz
 * @Date 2024/6/14 15:16
 * @Description JDK动态代理的InvocationHandler实现
 */
public class OrderServiceInvocationHandler implements InvocationHandler {
    
    private Object target;

    public OrderServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        long start = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long end = System.currentTimeMillis();
        
        System.out.println("JDK动态代理 >>> 操作耗时:" + (end - start) + "ms");
        return result;
    }
}
