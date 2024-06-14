package com.mnd;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 线程不安全
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;

    private Singleton05() {}

    public static Singleton05 getInstance() {
        if (INSTANCE == null) {
            
            // 妄图通过减小同步代码块的方式提高效率，但是不可行，线程不安全
            synchronized (Singleton05.class) {
                
                // 测试线程不安全代码
                try {
                    TimeUnit.MILLISECONDS.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton05.getInstance().hashCode());
            }).start();
        }
    }
}
