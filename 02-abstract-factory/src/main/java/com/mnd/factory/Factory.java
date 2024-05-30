package com.mnd.factory;

import com.mnd.computer.Computer;
import com.mnd.phone.Phone;

public interface Factory {
    
    Phone createPhone();
    
    Computer createComputer();
}
