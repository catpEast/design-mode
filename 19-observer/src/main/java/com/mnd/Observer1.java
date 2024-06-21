package com.mnd;

public class Observer1 implements Observer {
    @Override
    public void update(Object object) {
        System.out.println("观察者1收到消息: " + object);
    }
}
