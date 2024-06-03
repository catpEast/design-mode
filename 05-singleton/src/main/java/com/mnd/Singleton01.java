package com.mnd;

/**
 * 饿汉式
 * 线程安全
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 
 * 举例子：玩游戏时地图还没有打开呢，但是程序已经将这些地图全部实例化
 * 用手机刚打开游戏内存满了，手机卡了，感觉好像需要换了
 */
public class Singleton01 {
    
    private static final Singleton01 INSTANCE = new Singleton01();
    
    private Singleton01() {}
    
    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
    }
}
