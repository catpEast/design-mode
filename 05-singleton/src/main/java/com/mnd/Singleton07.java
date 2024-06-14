package com.mnd;

/**
 * 静态内部类方式
 * 线程安全
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Singleton07 {
    
    private Singleton07() {}
    
    public static Singleton07 getInstance() {
        return Singleton07Holder.INSTANCE;
    }

    public static class Singleton07Holder {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton07.getInstance().hashCode());
            }).start();
        }
    }

}
