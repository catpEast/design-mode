package com.mnd;

public class Observer2 implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("观察者2收到消息: " + object);
    }
}
