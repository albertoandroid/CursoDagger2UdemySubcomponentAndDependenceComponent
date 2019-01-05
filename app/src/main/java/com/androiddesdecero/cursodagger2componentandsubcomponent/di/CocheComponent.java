package com.androiddesdecero.cursodagger2componentandsubcomponent.di;

import com.androiddesdecero.cursodagger2componentandsubcomponent.ui.MainActivity;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

@Component(modules = CocheModule.class, dependencies = MotorComponent.class)
public interface CocheComponent {

    void inject(MainActivity mainActivity);
}
