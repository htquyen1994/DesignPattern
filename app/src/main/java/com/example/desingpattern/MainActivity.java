package com.example.desingpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.desingpattern.Creational.AbstractFactory.constants.MaterialType;
import com.example.desingpattern.Creational.AbstractFactory.furnitures.FurnitureFactory;
import com.example.desingpattern.Creational.AbstractFactory.products.PlasticChar;
import com.example.desingpattern.Creational.AbstractFactory.products.WoodChar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create abstract factory
        PlasticChar plasticChar = (PlasticChar) FurnitureFactory.getFactory(MaterialType.PLASTIC).createChair();
        WoodChar woodChar = (WoodChar) FurnitureFactory.getFactory(MaterialType.WOOD).createChair();
        plasticChar.create();
        woodChar.create();
    }
}
