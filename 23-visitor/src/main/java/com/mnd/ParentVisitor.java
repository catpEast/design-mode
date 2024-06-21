package com.mnd;

public class ParentVisitor implements Visitor{
    
    
    @Override
    public void visit(Student student) {
        student.study();
    }

    @Override
    public void visit(Teacher teacher) {
        teacher.teach();
    }
}
