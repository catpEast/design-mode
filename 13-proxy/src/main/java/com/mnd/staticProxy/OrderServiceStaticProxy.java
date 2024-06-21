package com.mnd.staticProxy;

import com.mnd.order.IOrderService;

/**
 * @Author wyz
 * @Date 2024/6/14 14:09
 * @Description
 */
public class OrderServiceStaticProxy implements IOrderService {
    
    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void add(String orderNo) {
        long start = System.currentTimeMillis();
        orderService.add(orderNo);
        long end = System.currentTimeMillis();
        System.out.println("静态代理 >>> 操作耗时:" + (end - start) + "ms");
    }

    @Override
    public void delete(String orderNo) {
        long start = System.currentTimeMillis();
        orderService.delete(orderNo);
        long end = System.currentTimeMillis();
        System.out.println("静态代理 >>> 操作耗时:" + (end - start) + "ms");
    }

    @Override
    public void modify(String orderNo) {
        long start = System.currentTimeMillis();
        orderService.modify(orderNo);
        long end = System.currentTimeMillis();
        System.out.println("静态代理 >>> 操作耗时:" + (end - start) + "ms");
    }

    @Override
    public void query(String orderNo) {
        long start = System.currentTimeMillis();
        orderService.query(orderNo);
        long end = System.currentTimeMillis();
        System.out.println("静态代理 >>> 操作耗时:" + (end - start) + "ms");
    }
}
