package com.neoflex.hw2.task2;

public class Point implements Figure{
    private static final int POINT_PARAMETER = 0;

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
        return POINT_PARAMETER;
    }

    private int getSquare(){
        return POINT_PARAMETER;
    }
}
