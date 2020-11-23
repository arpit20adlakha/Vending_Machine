package com.company.Factory;

import com.company.VendingMachine;
import com.company.VendingMachineI;

public class VendingMachineFactory {
    public static VendingMachineI getVendingMachine() {
        return new VendingMachine();
    }

}
