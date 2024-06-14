package com.mnd.staticProxy;

import com.mnd.order.IOrderService;
import com.mnd.order.OrderService;

/**
 * @Author wyz
 * @Date 2024/6/14 11:02
 * @Description 静态代理
 */
public class Main {
    
    public static void main(String[] args) {
        String orderNo = "1002";
        IOrderService orderService = new OrderService();
        IOrderService staticProxy = new OrderServiceStaticProxy(orderService);
        staticProxy.add(orderNo);
        staticProxy.delete(orderNo);
        staticProxy.modify(orderNo);
        staticProxy.query(orderNo);
    }
}
