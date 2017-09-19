package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Request2 extends AbstactRequest{

    public Request2(Object object) {
        super(object);
    }

    @Override
    protected int getRequestLevel() {
        return 2;
    }
}
