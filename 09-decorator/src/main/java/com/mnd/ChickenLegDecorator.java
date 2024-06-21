package com.mnd;

public class ChickenLegDecorator extends NoodlesDecorator {
    
    public ChickenLegDecorator(INoodles noodles) {
        super(noodles);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("加个鸡腿");
    }
}
