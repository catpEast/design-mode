package com.mnd;

/**
 * 枚举类方式
 * 线程安全
 * 不仅可以解决线程同步，还可以防止反序列化，Effective Java 推荐
 */
public enum Singleton08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton08.INSTANCE.hashCode());
            }).start();
        }
    }
}
