package com.example.desingpattern.Creational.MethodFactory.banks;

import android.util.Log;

import com.example.desingpattern.Creational.MethodFactory.interfaces.IBank;

public class VietComBank implements IBank {
    @Override
    public void getInfoBank() {
        Log.d("MethodFactory", "I am VietComBank");
    }
}
