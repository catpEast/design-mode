package com.mnd;

public class TerminalExpression implements Expression{
    
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String content) {
        return content.contains(data);
    }
}
