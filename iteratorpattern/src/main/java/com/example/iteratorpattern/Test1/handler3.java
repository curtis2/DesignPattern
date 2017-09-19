package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class handler3 extends AbstractHandler{

    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstactRequest request) {
        System.out.println("handler3 handler request:"+request.getRequestLevel());
    }
}
