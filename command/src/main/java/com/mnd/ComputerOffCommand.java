package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/18 8:50
 * @Description
 */
public class ComputerOffCommand implements Command{
    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
