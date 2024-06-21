package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:22
 * @Description
 */
public class Calculator {
    
    private Strategy strategy;
    
    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public int calculate(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
