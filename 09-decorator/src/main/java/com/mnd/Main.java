package com.mnd;

public class Main {
    
    public static void main(String[] args) {

        INoodles noodles = new Noodles();
        INoodles eggDecorator = new EggDecorator(noodles);
        eggDecorator.cook();

        INoodles beefDecorator = new BeefDecorator(eggDecorator);
        beefDecorator.cook();

        INoodles chickenLegDecorator = new ChickenLegDecorator(beefDecorator);
        chickenLegDecorator.cook();
    }
}