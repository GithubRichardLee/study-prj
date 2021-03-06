package com.samin.designpattern.proxy2;

public class Agent implements Subject {

    private Subject star;

    Agent(Subject star) {
        this.star = star;
    }

    @Override
    public void movie() {
        System.out.println("I am agent. I agree this work...");
        star.movie();
    }

    @Override
    public Agent getAgent() {
        return this;
    }
}
