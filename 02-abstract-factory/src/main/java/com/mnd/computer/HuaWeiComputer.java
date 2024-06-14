package com.mnd.computer;

public class HuaWeiComputer implements Computer{
    
    @Override
    public void code() {
        System.out.println("华为电脑 写代码");
    }

    @Override
    public void playGame() {
        System.out.println("华为电脑 打游戏");
    }
}
