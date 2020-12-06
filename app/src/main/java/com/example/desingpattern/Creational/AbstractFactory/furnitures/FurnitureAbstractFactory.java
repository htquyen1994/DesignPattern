package com.example.desingpattern.Creational.AbstractFactory.furnitures;

import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateChair;
import com.example.desingpattern.Creational.AbstractFactory.interfaces.ICreateTable;

public abstract class FurnitureAbstractFactory {
    public abstract ICreateTable createTable();
    public abstract ICreateChair createChair();
}
