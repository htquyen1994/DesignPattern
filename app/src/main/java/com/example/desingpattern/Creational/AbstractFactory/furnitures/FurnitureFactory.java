package com.example.desingpattern.Creational.AbstractFactory.furnitures;

import com.example.desingpattern.Creational.AbstractFactory.constants.MaterialType;

public class FurnitureFactory {

    private FurnitureFactory() {

    }

    public static FurnitureAbstractFactory getFactory(MaterialType type) {
        if (type == MaterialType.PLASTIC) {
            return new FactoryPlasticProduct();
        } else if (type == MaterialType.WOOD) {
            return new FactoryWoodProduct();
        } else {
            throw new UnsupportedOperationException("Not support this material");
        }
    }
}
