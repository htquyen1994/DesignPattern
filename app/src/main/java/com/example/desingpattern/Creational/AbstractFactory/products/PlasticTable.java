package com.example.desingpattern.Creational.AbstractFactory.products;

import android.util.Log;

import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateTable;

public class PlasticTable implements ICreateTable {

    @Override
    public void create() {
        Log.d("AbstractFactory", "Create Plastic Table");
    }
}
