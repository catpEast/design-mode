package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/14 10:41
 * @Description
 */
public class Main {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Shape circle = ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}