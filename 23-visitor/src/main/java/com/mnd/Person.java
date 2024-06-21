package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 17:05
 * @Description 学校里面的老师或学生
 */
public abstract class Person {
    // 姓名
    private String name;
    // 重点班 普通班 | 特级教师 普通教师
    private String identity;
    // 班级
    private String clazz;

    public Person(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }
    
    public abstract void accept(Visitor visitor);
}
