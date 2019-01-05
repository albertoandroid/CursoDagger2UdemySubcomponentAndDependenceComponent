package com.androiddesdecero.cursodagger2componentandsubcomponent.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.cursodagger2componentandsubcomponent.Coche;
import com.androiddesdecero.cursodagger2componentandsubcomponent.Motor;
import com.androiddesdecero.cursodagger2componentandsubcomponent.R;
import com.androiddesdecero.cursodagger2componentandsubcomponent.di.BaseApplication;

import javax.inject.Inject;
import javax.inject.Named;

public class Main3Activity extends AppCompatActivity {

    @Named("coche_gasolina")
    @Inject
    Coche cocheGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ((BaseApplication)getApplication()).plusCocheSubComponent().inject(this);
        Log.d("TAG1", cocheGasolina.getCoche());
    }
}
