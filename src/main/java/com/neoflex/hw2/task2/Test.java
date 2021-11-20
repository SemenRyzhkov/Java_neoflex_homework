package com.neoflex.hw2.task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Figure point = new Point();
        Figure square = new Square(3);
        Figure line = new Line(100);
        Figure rect = new Rectangle(30, 10);
        Figure circle = new Circle(10);
        Figure triangle = new Triangle(3, 4, 5);
        List<Figure> figureList = List.of(point, square, line, rect, circle, triangle);
        figureList.forEach(Figure::getParameters);
    }
}