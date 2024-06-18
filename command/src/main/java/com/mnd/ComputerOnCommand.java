package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/18 8:46
 * @Description
 */
public class ComputerOnCommand implements Command {
    
    private Computer computer;
    
    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
