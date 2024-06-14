package com.mnd.factory;

import com.mnd.computer.Computer;
import com.mnd.computer.HuaWeiComputer;
import com.mnd.phone.HuaWeiPhone;
import com.mnd.phone.Phone;

public class HuaWeiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer createComputer() {
        return new HuaWeiComputer();
    }
}
