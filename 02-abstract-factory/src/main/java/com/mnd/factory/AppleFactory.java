package com.mnd.factory;

import com.mnd.computer.AppleComputer;
import com.mnd.computer.Computer;
import com.mnd.phone.ApplePhone;
import com.mnd.phone.Phone;

public class AppleFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }
}
