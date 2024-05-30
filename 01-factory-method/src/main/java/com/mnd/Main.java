package com.mnd;

import com.mnd.factory.IPhoneFactory;
import com.mnd.factory.XiaoMiPhoneFactory;
import com.mnd.phone.Phone;
import com.mnd.phone.XiaoMiPhone;

public class Main {

    public static void main(String[] args) {
        
        // 苹果手机
        Phone iphone = new IPhoneFactory().create();
        iphone.call();
        
        // 小米手机
        Phone xiaoMiPhone = new XiaoMiPhoneFactory().create();
        xiaoMiPhone.call();
    }
}
