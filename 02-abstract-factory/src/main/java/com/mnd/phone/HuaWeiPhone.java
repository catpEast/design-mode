package com.mnd.phone;

public class HuaWeiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机 打电话");
    }

    @Override
    public void send() {
        System.out.println("华为手机 发短信");
    }
}
