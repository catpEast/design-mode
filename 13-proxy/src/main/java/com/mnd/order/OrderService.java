package com.mnd.order;

import java.util.concurrent.TimeUnit;

/**
 * @Author wyz
 * @Date 2024/6/14 14:05
 * @Description
 */
public class OrderService implements IOrderService {
    
    @Override
    public void add(String orderNo) {
        // 模拟新增订单操作
        try {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.println("新增订单[orderNo=" + orderNo + "]");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String orderNo) {
        // 模拟删除订单操作
        try {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.println("删除订单[orderNo=" + orderNo + "]");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modify(String orderNo) {
        // 模拟修改订单操作
        try {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.println("修改订单信息[orderNo=" + orderNo + "]");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void query(String orderNo) {
        // 模拟查找订单操作
        try {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.println("查找订单信息[orderNo=" + orderNo + "]");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
