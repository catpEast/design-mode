package com.mnd;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Context >>> 停止状态...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State...";
    }
}
