package com.mnd;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObservers("Hello world!");
    }
}