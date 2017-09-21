package com.simon.designpattern.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 *
 *  动态代理需要实现InvocationHandler的这个方法
 */

public class DynamicProxy implements InvocationHandler {
    /**
     * 被代理者对象
     */
    private Object obj;

    public  DynamicProxy(Object object){
        this.obj=object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在这之前，可以执行一些公共方法.例如数据的开启和关闭方法
        System.out.print("open Transaction ！\n");
        //执行被代理者的方法
        Object result=method.invoke(obj,args);
        System.out.print("close Transaction ！\n");
        return result;
    }
}
