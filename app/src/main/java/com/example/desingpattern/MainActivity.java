package com.example.desingpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.desingpattern.Creational.AbstractFactory.constants.MaterialType;
import com.example.desingpattern.Creational.AbstractFactory.furnitures.FurnitureFactory;
import com.example.desingpattern.Creational.AbstractFactory.products.PlasticChar;
import com.example.desingpattern.Creational.AbstractFactory.products.WoodChar;
import com.example.desingpattern.Creational.Builder.BankAccount;
import com.example.desingpattern.Creational.MethodFactory.BankFactory;
import com.example.desingpattern.Creational.MethodFactory.banks.TPBank;
import com.example.desingpattern.Creational.MethodFactory.banks.VietComBank;
import com.example.desingpattern.Creational.MethodFactory.constants.BankType;
import com.example.desingpattern.Structurals.Adapter.JapanAdaptee;
import com.example.desingpattern.Structurals.Adapter.TranslatorAdapter;
import com.example.desingpattern.Structurals.Adapter.VietNamTarget;

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

        // method factory
        TPBank tpBank = (TPBank) BankFactory.getBank(BankType.TPBANK);
        VietComBank vietComBank = (VietComBank) BankFactory.getBank(BankType.VIETCOMBANK);
        tpBank.getInfoBank();
        vietComBank.getInfoBank();

        // Pattern builder
        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("VietCombank", "A1234").builder();
        Log.d("BankAccount", bankAccount.toString());

        // Adapter pattern
        VietNamTarget target = new TranslatorAdapter(new JapanAdaptee());
        target.send("Hello japan");



    }
}
