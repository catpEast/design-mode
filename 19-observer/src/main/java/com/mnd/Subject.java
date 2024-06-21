package com.mnd;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private List<Observer> observerList = new ArrayList<Observer>();
    
    public void add(Observer observer) {
        observerList.add(observer);
    }
    
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
    
    public void notifyObservers(Object object) {
        for (Observer observer : observerList) {
            observer.update(object);
        }
    }
}
