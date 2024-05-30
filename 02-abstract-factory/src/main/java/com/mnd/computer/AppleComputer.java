package com.mnd.computer;

public class AppleComputer implements Computer{
    
    @Override
    public void code() {
        System.out.println("苹果电脑 写代码");
    }

    @Override
    public void playGame() {
        System.out.println("苹果电脑 打游戏");
    }
}
