package com.mnd.phone;

public class IPhone implements Phone {
    @Override
    public void call() {
        System.out.println("用苹果手机打电话！");
    }
}