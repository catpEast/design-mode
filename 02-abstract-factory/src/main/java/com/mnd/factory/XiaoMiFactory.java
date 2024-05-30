package com.mnd.factory;

import com.mnd.computer.Computer;
import com.mnd.computer.XiaoMiComputer;
import com.mnd.phone.Phone;
import com.mnd.phone.XiaoMiPhone;

public class XiaoMiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Computer createComputer() {
        return new XiaoMiComputer();
    }
}
