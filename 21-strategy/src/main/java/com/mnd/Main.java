package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:03
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new OperationAdd());
        System.out.println(calculator.calculate(3, 4));
        
        calculator.setStrategy(new OperationSubtract());
        System.out.println(calculator.calculate(3, 4));
        
        calculator.setStrategy(new OperationMultiply());
        System.out.println(calculator.calculate(3, 4));
    }
}