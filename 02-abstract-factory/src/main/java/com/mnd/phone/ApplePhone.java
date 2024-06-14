package com.mnd.phone;

public class ApplePhone implements Phone {
    
    @Override
    public void call() {
        System.out.println("苹果手机 打电话");
    }

    @Override
    public void send() {
        System.out.println("苹果手机 发短信");
    }
}
