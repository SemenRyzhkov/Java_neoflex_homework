package com.neoflex.patterns_hw.singleton;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.addClassAndShowInfo(ArrayList.class);
        logger.addClassAndShowInfo(Object.class);
        logger.addClassAndShowInfo(String.class);
    }
}
