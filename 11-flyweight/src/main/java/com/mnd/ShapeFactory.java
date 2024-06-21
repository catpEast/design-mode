package com.mnd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author wyz
 * @Date 2024/6/14 10:51
 * @Description
 */
public class ShapeFactory {
    
    private static final Map<String, Shape> circleMap = new ConcurrentHashMap<>();
    
    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(3, 3, 4, color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color " + color);
        }
        return circle;
    }
}
