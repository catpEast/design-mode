package com.mnd.factory;

import com.mnd.phone.IPhone;
import com.mnd.phone.Phone;

public class IPhoneFactory implements PhoneFactory {
    public Phone create() {
        return new IPhone();
    }
}