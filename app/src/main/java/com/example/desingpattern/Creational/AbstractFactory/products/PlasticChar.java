package com.example.desingpattern.Creational.AbstractFactory.products;

import android.util.Log;

import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateChair;

public class PlasticChar implements ICreateChair {

    @Override
    public void create() {
        Log.d("AbstractFactory", "Create Plastic Char");
    }
}
