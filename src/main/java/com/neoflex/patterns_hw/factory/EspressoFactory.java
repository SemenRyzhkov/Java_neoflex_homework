package com.neoflex.patterns_hw.factory;

public class EspressoFactory implements CoffeeFactory{
    @Override
    public Coffee getCoffee() {
        return new Espresso();
    }
}
