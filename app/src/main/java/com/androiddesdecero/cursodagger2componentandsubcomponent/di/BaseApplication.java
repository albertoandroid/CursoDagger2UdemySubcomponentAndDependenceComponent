package com.androiddesdecero.cursodagger2componentandsubcomponent.di;

import android.app.Application;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

public class BaseApplication extends Application {

    private MotorComponent motorComponent;

    private CocheComponent cocheComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        motorComponent = DaggerMotorComponent
                .builder()
                .build();

        cocheComponent = DaggerCocheComponent
                .builder()
                .motorComponent(getMotorComponent())
                .build();
    }

    public MotorComponent getMotorComponent(){
        return motorComponent;
    }
}
