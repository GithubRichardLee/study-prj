package com.samin.designpattern.command;

public class CloseTvCommand implements Command {

    private Television tv;

    public CloseTvCommand() {
        tv = new Television();
    }

    public void execute(int i) {
        tv.close();
    }
}
