package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class handler2  extends AbstractHandler{

    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstactRequest request) {
        System.out.println("handler2 handler request:"+request.getRequestLevel());
    }
}
