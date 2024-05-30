package com.mnd;

import com.mnd.computer.Computer;
import com.mnd.factory.AppleFactory;
import com.mnd.factory.Factory;
import com.mnd.factory.HuaWeiFactory;
import com.mnd.factory.XiaoMiFactory;
import com.mnd.phone.Phone;

public class Main {
    
    public static void main(String[] args) {
        
        // 苹果工厂 生产 苹果手机、苹果电脑
        Factory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Computer appleComputer = appleFactory.createComputer();
        applePhone.call();
        applePhone.send();
        appleComputer.code();
        appleComputer.playGame();

        // 小米工厂 生产 小米手机、小米电脑
        Factory xiaoMiFactory = new XiaoMiFactory();
        Phone xiaoMiPhone = xiaoMiFactory.createPhone();
        Computer xiaoMiComputer = xiaoMiFactory.createComputer();
        xiaoMiPhone.call();
        xiaoMiPhone.send();
        xiaoMiComputer.code();
        xiaoMiComputer.playGame();

        // 华为工厂 生产 华为手机、华为电脑
        Factory huaWeiFactory = new HuaWeiFactory();
        Phone huaWeiPhone = huaWeiFactory.createPhone();
        Computer huaWeiComputer = huaWeiFactory.createComputer();
        huaWeiPhone.call();
        huaWeiPhone.send();
        huaWeiComputer.code();
        huaWeiComputer.playGame();
        
    }
}