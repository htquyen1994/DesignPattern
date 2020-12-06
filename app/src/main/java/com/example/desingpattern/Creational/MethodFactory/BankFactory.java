package com.example.desingpattern.Creational.MethodFactory;

import com.example.desingpattern.Creational.MethodFactory.banks.TPBank;
import com.example.desingpattern.Creational.MethodFactory.banks.VietComBank;
import com.example.desingpattern.Creational.MethodFactory.constants.BankType;
import com.example.desingpattern.Creational.MethodFactory.interfaces.IBank;

public class BankFactory {
    private BankFactory() {}

    public static IBank getBank(BankType type) {
        switch (type) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietComBank();
            default:
                throw new UnsupportedOperationException("This type bank not support");
        }
    }
}
