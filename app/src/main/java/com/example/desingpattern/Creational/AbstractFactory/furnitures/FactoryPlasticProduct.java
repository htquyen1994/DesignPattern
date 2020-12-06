package com.example.desingpattern.Creational.AbstractFactory.furnitures;

import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateChair;
import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateTable;
import com.example.desingpattern.Creational.AbstractFactory.products.PlasticChar;
import com.example.desingpattern.Creational.AbstractFactory.products.PlasticTable;

public class FactoryPlasticProduct extends FurnitureAbstractFactory {

    @Override
    public ICreateTable createTable() {
        return new PlasticTable();
    }

    @Override
    public ICreateChair createChair() {
        return new PlasticChar();
    }
}
