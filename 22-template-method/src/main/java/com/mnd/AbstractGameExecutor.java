package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:48
 * @Description
 */
public abstract class AbstractGameExecutor implements GameExecutor {

    // 加载游戏
    public abstract void load();
    // 运行游戏
    public abstract void run();
    // 结束游戏
    public abstract void end();
    
    @Override
    public void play() {
        load();
        run();
        System.out.println("玩游戏...");
        end();
    }
}
