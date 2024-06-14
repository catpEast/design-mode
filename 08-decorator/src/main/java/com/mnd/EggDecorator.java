package com.mnd;

public class EggDecorator extends NoodlesDecorator {
    
    public EggDecorator(INoodles noodles) {
        super(noodles);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("加个鸡蛋...");
    }
}
