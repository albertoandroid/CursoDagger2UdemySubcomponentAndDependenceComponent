package com.androiddesdecero.cursodagger2componentandsubcomponent.di;

import com.androiddesdecero.cursodagger2componentandsubcomponent.ui.Main2Activity;
import com.androiddesdecero.cursodagger2componentandsubcomponent.ui.MainActivity;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

@Component(modules = MotorModule.class)
public interface MotorComponent {

    void inject(Main2Activity main2Activity);

}
