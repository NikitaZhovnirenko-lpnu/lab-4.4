package com.company;
//рівносторонній
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double firstSide, double secondSide, int angle) {
        super(firstSide, secondSide, angle);
    }

    @Override
    public double perimeter() {
        return getFirstSide() * 3;
    }

    @Override
    public double area() {
        return (Math.pow(getFirstSide(), 2) * Math.sqrt(3)) / 4;
    }
}
