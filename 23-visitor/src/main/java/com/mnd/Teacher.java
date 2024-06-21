package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 17:08
 * @Description
 */
public class Teacher extends Person {
    
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void teach() {
        System.out.println("数学老师");
    }
}
