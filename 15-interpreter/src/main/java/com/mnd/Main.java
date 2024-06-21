package com.mnd;

public class Main {
    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();
        boolean exp = maleExpression.interpreter("zhangsan");
        System.out.println(exp);
    }
    
    public static Expression getMaleExpression() {
        TerminalExpression zhangsan = new TerminalExpression("zhangsan");
        TerminalExpression lisi = new TerminalExpression("lisi");
        return new OrExpression(zhangsan, lisi);
    }
}