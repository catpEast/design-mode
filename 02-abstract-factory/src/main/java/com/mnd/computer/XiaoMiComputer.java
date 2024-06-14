package com.mnd.computer;

public class XiaoMiComputer implements Computer{
    
    @Override
    public void code() {
        System.out.println("小米电脑 写代码");
    }

    @Override
    public void playGame() {
        System.out.println("小米电脑 打游戏");
    }
}
