package com.neoflex.hw2.task2;

public class Circle implements Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getParameters() {
        System.out.println(
                String.format("Тип фигуры: %s, Длина окружности: %s, Площадь: %s",
                        getType(),
                        getLineLength(),
                        getSquare()));
    }

    private String getType() {
        return this.getClass().getSimpleName();
    }

    private int getLineLength() {
        return (int) (2 * Math.PI * this.radius);
    }

    private int getSquare() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }
}
