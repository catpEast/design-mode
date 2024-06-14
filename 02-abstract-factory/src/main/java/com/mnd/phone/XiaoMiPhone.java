package com.mnd.phone;

public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("小米手机 打电话");
    }

    @Override
    public void send() {
        System.out.println("小米手机 发短信");
    }
}
