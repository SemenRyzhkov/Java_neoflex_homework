package com.neoflex.hw1;

public class HW1 {
    boolean isActive = false;
    byte b = 8;
    int a = 1111;
    char ch = 'a';
    short sh = 100;
    long l = 200L;
    double x = 8.5;
    float y = 2.7F;
    String text = "Text";


    public static void main(String[] args) {
        isLeapYear(6666);
    }

    private static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean isInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    private static void positiveOrNegative(int num) {
        System.out.println(num >= 0 ? "Number is positive" : "Number is negative");
    }

    private static boolean isNegative(int a) {
        return a < 0;
    }

    private static void hello(String name) {
        System.out.printf("Hello, %s%n", name);
    }

    //https://coderoad.ru/40578753/%D0%92%D0%B8%D1%81%D0%BE%D0%BA%D0%BE%D1%81%D0%BD%D1%8B%D0%B9-%D0%B3%D0%BE%D0%B4-Java-Q
    private static void isLeapYear(int year) {
        System.out.println((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))
                ? String.format("%S is a leap year.", year)
                : String.format("%S is not a leap year.", year));
    }
}
