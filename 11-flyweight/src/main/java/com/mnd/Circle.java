package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/14 10:46
 * @Description
 */
public class Circle implements Shape {
    
    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public Circle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle >>> " + 
            "{x=" + x +
            ", y=" + y +
            ", radius=" + radius +
            ", color='" + color + "}");
    }
    
}
