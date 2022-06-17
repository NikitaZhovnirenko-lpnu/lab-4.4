package com.company;
//прямокутний
public class RightTriangle extends Triangle {
    public RightTriangle(double firstSide, double secondSide, int angle) {
        super(firstSide, secondSide, angle);
        setAngle(90);
    }
    public RightTriangle(double firstSide, double secondSide){
        super(firstSide, secondSide);
        setAngle(90);
    }

    @Override
    public double perimeter() {
        double thirdSide = Math.sqrt(Math.pow(getFirstSide(), 2) + Math.pow(getSecondSide(), 2));
    return thirdSide + getFirstSide() + getSecondSide();
    }

    @Override
    public double area() {
        return (getFirstSide() * getSecondSide())/2;

    }
}
