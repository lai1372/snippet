package com.snippetstest.snippettest.models;

public class Rectangle implements Shape{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public String getName(){
        return "Rectangle";
    }
    @Override
    public double getArea() {
        return length * breadth;
    }
}
