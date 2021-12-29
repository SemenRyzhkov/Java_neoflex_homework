package com.neoflex.hw2.task2;

public class Triangle implements Figure {
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getParameters() {
        System.out.println(
                String.format("Тип фигуры: %s, Периметр: %s, Площадь: %s",
                        getType(),
                        getPerimeter(side1, side2, side3),
                        getSquare(side1, side2, side3)));
    }

    private String getType() {
        return this.getClass().getSimpleName();
    }

    private int getPerimeter(int a, int b, int c) {
        return a + b + c;
    }

    private int getSquare(int a, int b, int c) {
        int p = (a + b + c) / 2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
