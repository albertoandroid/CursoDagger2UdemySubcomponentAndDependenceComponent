package com.androiddesdecero.cursodagger2componentandsubcomponent.di;

import com.androiddesdecero.cursodagger2componentandsubcomponent.Coche;
import com.androiddesdecero.cursodagger2componentandsubcomponent.ui.Main3Activity;

import dagger.Subcomponent;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

@Subcomponent(modules = CocheModule.class)
public interface CocheSubComponent {

    void inject(Main3Activity main3Activity);
}
