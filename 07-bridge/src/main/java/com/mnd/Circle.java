package com.mnd;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("画原形 " + color.paint());
    }
}
