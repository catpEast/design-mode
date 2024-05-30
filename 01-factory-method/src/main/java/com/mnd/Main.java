package com.mnd;

import com.mnd.factory.ApplePhoneFactory;
import com.mnd.factory.XiaoMiPhoneFactory;
import com.mnd.phone.Phone;

public class Main {

    public static void main(String[] args) {
        
        // 苹果手机
        Phone applePhone = new ApplePhoneFactory().create();
        applePhone.call();
        
        // 小米手机
        Phone xiaoMiPhone = new XiaoMiPhoneFactory().create();
        xiaoMiPhone.call();
    }
}
