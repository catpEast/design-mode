package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/21 16:22
 * @Description
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
