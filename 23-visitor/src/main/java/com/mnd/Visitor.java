package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 17:07
 * @Description
 */
public interface Visitor {
    
    void visit(Student student);
    
    void visit(Teacher teacher);
}
