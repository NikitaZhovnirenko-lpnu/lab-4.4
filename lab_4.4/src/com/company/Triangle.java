package com.company;

public abstract class Triangle {
    private double firstSide;
    private double secondSide;
    private int angle;

    public Triangle(double firstSide, double secondSide, int angle) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    public Triangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Triangle() {
    }

    public double perimeter(){
        return getFirstSide() + getSecondSide() +
                Math.sqrt(Math.pow(getFirstSide(), 2) + Math.pow(getSecondSide(), 2)
                - 2 * getFirstSide() * getSecondSide() * Math.cos(Math.toRadians(getAngle())));
    }

    public double area(){
        return 0;
    }



    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", angle=" + angle +
                '}';
    }
}
