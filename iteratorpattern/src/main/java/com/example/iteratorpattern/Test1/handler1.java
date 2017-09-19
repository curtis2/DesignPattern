package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class handler1 extends  AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstactRequest request) {
        System.out.println("handler1 handler request:"+request.getRequestLevel());
    }
}
