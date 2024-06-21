package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 17:10
 * @Description
 */
public class Student extends Person {
    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        
    }
}
