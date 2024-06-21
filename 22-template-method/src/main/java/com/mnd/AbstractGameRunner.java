package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:43
 * @Description
 */
public abstract class AbstractGameRunner extends AbstractGameLoader {
    @Override
    public void run() {
        System.out.println("运行游戏...");
    }
}
