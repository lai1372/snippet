package com.snippetstest.snippettest.models;

public class Square implements Shape{
private double dimension;

    public Square(double dimension) {
        this.dimension = dimension;
    }

    @Override
    public double getArea() {
        return dimension * dimension;
    }
}
