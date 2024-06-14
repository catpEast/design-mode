package com.mnd;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 线程安全
 * 双重检查锁，不仅线程安全，而且效率高
 */
public class Singleton06 {
    
    // 使用 volatile 关键字，防止指令重排
    private static volatile Singleton06 INSTANCE;

    private Singleton06() {}

    public static Singleton06 getInstance() {
        if (INSTANCE == null) {
            
            synchronized (Singleton06.class) {
                // 双重检查锁
                if (INSTANCE == null) {
                    
                    // 测试线程不安全代码
                    try {
                        TimeUnit.MILLISECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    
                    INSTANCE = new Singleton06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                System.out.println(Singleton06.getInstance().hashCode());
            }).start();
        }
    }
}
