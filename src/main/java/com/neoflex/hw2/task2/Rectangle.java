package com.neoflex.hw2.task2;

public class Rectangle implements Figure {
    private final int side1;
    private final int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    public void getParameters() {
        System.out.println(
                String.format("Тип фигуры: %s, Периметр: %s, Площадь: %s",
                        getType(),
                        getPerimeter(side1, side2),
                        getSquare(side1, side2)));
    }

    private String getType() {
        return this.getClass().getSimpleName();
    }

    private int getPerimeter(int a, int b) {
        return 2 * a + 2 * b;
    }

    private int getSquare(int a, int b) {
        return a * b;
    }
}
