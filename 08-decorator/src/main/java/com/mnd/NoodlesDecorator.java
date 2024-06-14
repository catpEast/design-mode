package com.mnd;

public abstract class NoodlesDecorator implements INoodles {
    
    private INoodles noodles;

    public NoodlesDecorator(INoodles noodles) {
        this.noodles = noodles;
    }

    @Override
    public void cook() {
        if (noodles != null) {
            noodles.cook();
        }
    }
}
