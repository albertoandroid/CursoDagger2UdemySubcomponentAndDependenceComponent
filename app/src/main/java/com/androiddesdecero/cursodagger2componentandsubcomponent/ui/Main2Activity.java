package com.androiddesdecero.cursodagger2componentandsubcomponent.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.cursodagger2componentandsubcomponent.Motor;
import com.androiddesdecero.cursodagger2componentandsubcomponent.R;
import com.androiddesdecero.cursodagger2componentandsubcomponent.di.BaseApplication;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ((BaseApplication)getApplication()).getMotorComponent().inject(this);
        Log.d("TAG12", motor.getTipoMotor());
    }
}
