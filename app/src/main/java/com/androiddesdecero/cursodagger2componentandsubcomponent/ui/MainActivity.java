package com.androiddesdecero.cursodagger2componentandsubcomponent.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.cursodagger2componentandsubcomponent.Coche;
import com.androiddesdecero.cursodagger2componentandsubcomponent.Motor;
import com.androiddesdecero.cursodagger2componentandsubcomponent.R;
import com.androiddesdecero.cursodagger2componentandsubcomponent.di.BaseApplication;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private Button btSub;

    @Inject
    Coche cocheDiesel;

    @Named("coche_electrico")
    @Inject
    Coche cocheElectrico;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((BaseApplication)getApplication()).getCocheComponent().inject(this);
        setUpView();

        Log.d("TAG1", cocheDiesel.getCoche());
        Log.d("TAG1", cocheElectrico.getCoche());
    }

    private void setUpView(){
        bt = findViewById(R.id.bt2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });

        btSub = findViewById(R.id.bt3);
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });
    }
}
