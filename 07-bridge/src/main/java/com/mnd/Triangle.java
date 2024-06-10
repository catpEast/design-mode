package com.mnd;

public class Triangle extends Shape{
    
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("画三角形 " + color.paint());
    }
}
