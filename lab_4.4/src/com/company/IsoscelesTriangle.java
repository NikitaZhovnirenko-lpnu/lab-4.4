package com.company;
//рівнобедрений
public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double firstSide, double secondSide, int angle) {
        super(firstSide, secondSide, angle);
    }

    @Override
    public double area() {
        double height = Math.pow(getFirstSide(), 2) - Math.pow(getSecondSide()/2, 2);
        return (getSecondSide() + height) / 2;
    }
}
