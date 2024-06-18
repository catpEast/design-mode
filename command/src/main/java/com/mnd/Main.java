package com.mnd;

/**
 * @Author wyz
 * @Date 2024/6/18 8:41
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Command computerOnCommand = new ComputerOnCommand(computer);
        computerOnCommand.execute();
        
        Command computerOffCommand = new ComputerOffCommand(computer);
        computerOffCommand.execute();
    }
}