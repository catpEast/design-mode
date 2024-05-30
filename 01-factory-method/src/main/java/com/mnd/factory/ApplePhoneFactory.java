package com.mnd.factory;

import com.mnd.phone.ApplePhone;
import com.mnd.phone.Phone;

public class ApplePhoneFactory implements PhoneFactory {
    public Phone create() {
        return new ApplePhone();
    }
}