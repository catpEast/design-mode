package com.mnd;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 线程不安全
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;
    
    private Singleton03() {}
    
    public static Singleton03 getInstance() {
        if (INSTANCE == null) {

            // 测试线程不安全代码
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
