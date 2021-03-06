package com.samin.designpattern.observer;

public interface Observer {

    String getName();

    /**
     * 通知更新方法
     *
     * @param msg
     */
    public void update(String msg);
}
