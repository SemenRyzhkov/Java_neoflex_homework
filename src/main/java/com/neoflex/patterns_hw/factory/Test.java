package com.neoflex.patterns_hw.factory;

public class Test {
    public static void main(String[] args) {
        CoffeeFactory factory = configureFactory("americano");
        Coffee coffee = factory.getCoffee();
        coffee.coffee();
    }

    public static CoffeeFactory configureFactory(String coffee) {
        if (coffee.equalsIgnoreCase("espresso")) {
            return new EspressoFactory();
        } else if (coffee.equalsIgnoreCase("americano")) {
            return new AmericanoFactory();
        } else {
            throw new RuntimeException(coffee + " is not exist");
        }
    }
}
