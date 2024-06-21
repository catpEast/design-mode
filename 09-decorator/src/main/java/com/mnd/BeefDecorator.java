package com.mnd;

public class BeefDecorator extends NoodlesDecorator {

    public BeefDecorator(INoodles noodles) {
        super(noodles);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("加块牛肉...");
    }
}
