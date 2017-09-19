package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Request1 extends AbstactRequest {

    public Request1(Object object) {
        super(object);
    }

    @Override
    protected int getRequestLevel() {
        return 1;
    }
}
