package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public abstract class AbstactRequest {
    //处理对象
    protected  Object object;

    public AbstactRequest(Object object) {
        this.object = object;
    }

    /**
     * 获取请求者对象的处理级别
     */
    protected abstract int getRequestLevel();

}
