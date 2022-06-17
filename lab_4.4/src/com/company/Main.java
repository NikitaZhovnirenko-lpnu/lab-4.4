package com.company;

public class Main {

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle(5, 22);
        System.out.println("Площа: " + rightTriangle.area());
        System.out.println("Периметр: " + rightTriangle.perimeter());

        System.out.println();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3, 6, 60);
        System.out.println("Площа: " + isoscelesTriangle.area());
        System.out.println("Периметр: " + isoscelesTriangle.perimeter());
    }
}
