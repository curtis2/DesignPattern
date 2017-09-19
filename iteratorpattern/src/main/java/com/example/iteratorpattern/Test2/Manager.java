package com.example.iteratorpattern.Test2;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Manager extends Leader {
    @Override
    protected int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("Manager handler request:"+money);
    }
}
