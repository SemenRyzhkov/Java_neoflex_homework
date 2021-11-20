package com.neoflex.hw2.task2;

public class Line implements Figure{
    private final int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public void getParameters() {
        System.out.println(
                String.format("Тип фигуры: %s, Длина линий: %s, Площадь: %s",
                        getType(),
                        getLineLength(),
                        getSquare()));
    }

    private String getType(){
        return this.getClass().getSimpleName();
    }

    private int getLineLength(){
        return this.length;
    }

    private int getSquare(){
        return 0;
    }
}
