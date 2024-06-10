package com.mnd;

/**
 * 1.当系统需要在抽象化角色和具体化角色之间增加灵活性时，考虑使用桥接模式。
 * 2.对于不希望使用继承或因多层次继承导致类数量急剧增加的系统，桥接模式特别适用。
 * 3.当一个类存在两个独立变化的维度，且这两个维度都需要扩展时，使用桥接模式。
 */
public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.draw();

        Shape rectangle = new Rectangle(new BlueColor());
        rectangle.draw();

        Shape triangle = new Triangle(new Green());
        triangle.draw();
    }
}
