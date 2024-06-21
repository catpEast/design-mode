package com.mnd.order;

/**
 * @Author wyz
 * @Date 2024/6/14 14:04
 * @Description
 */
public interface IOrderService {
    
    void add(String orderNo);

    void delete(String orderNo);
    
    void modify(String orderNo);
    
    void query(String orderNo);
}
