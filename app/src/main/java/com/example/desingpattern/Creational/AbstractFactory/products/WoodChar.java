package com.example.desingpattern.Creational.AbstractFactory.products;

import android.util.Log;

import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateChair;

public class WoodChar implements ICreateChair {
    @Override
    public void create() {
        Log.d("AbstractFactory", "Create Wood Char");
    }
}
