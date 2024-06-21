package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:16
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张老师", "特级教师", "3年级2班的班主任");
        Student student = new Student("李四", "普通学生", "6年级1班");
        Visitor parentVisitor = new ParentVisitor();
        teacher.accept(parentVisitor);
        student.accept(parentVisitor);
    }
}