package com.example.desingpattern.Creational.AbstractFactory.furnitures;

import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateChair;
import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateTable;
import com.example.desingpattern.Creational.AbstractFactory.products.WoodChar;
import com.example.desingpattern.Creational.AbstractFactory.products.WoodTable;

public class FactoryWoodProduct extends FurnitureAbstractFactory {

    @Override
    public ICreateTable createTable() {
        return new WoodTable();
    }

    @Override
    public ICreateChair createChair() {
        return new WoodChar();
    }
}
