package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:39
 * @Description
 */
public abstract class AbstractGameLoader extends AbstractGameExecutor {

    @Override
    public void load() {
        System.out.println("加载游戏...");
    }
}
