package com.example.iteratorpattern.Test2;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Director extends Leader {

    @Override
    protected int limit() {
        return 3000;
    }

    @Override
    public void handle(int money) {
        System.out.println("Director handler request:"+money);
    }



}
