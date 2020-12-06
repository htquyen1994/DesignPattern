package com.example.desingpattern.Structurals.Adapter;

import android.util.Log;

public class TranslatorAdapter implements VietNamTarget {

    JapanAdaptee adaptee;

    public TranslatorAdapter(JapanAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String msg) {
        Log.d("Adapter", "TranslatorAdapter recevier: " + msg);
        adaptee.receiver(msg);
    }
}
