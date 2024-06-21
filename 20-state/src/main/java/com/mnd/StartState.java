package com.mnd;

public class StartState implements State {
    
    @Override
    public void doAction(Context context) {
        System.out.println("Context >>> 开始状态...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State...";
    }
}
