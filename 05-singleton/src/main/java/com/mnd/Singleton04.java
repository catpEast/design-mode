package com.mnd;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 线程安全
 * 通过 synchronized 关键字解决线程安全问题，但是效率低下
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;

    private Singleton04() {}

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            
            // 测试线程不安全代码
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }
}

