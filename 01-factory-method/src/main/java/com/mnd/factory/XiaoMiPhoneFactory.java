package com.mnd.factory;

import com.mnd.phone.Phone;
import com.mnd.phone.XiaoMiPhone;

public class XiaoMiPhoneFactory implements PhoneFactory {
    public Phone create() {
        return new XiaoMiPhone();
    }
}