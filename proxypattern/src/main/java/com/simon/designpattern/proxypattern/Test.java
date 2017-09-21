package com.simon.designpattern.proxypattern;

import java.lang.reflect.Proxy;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Test {
    public static void main(String[] strs){
        //静态代理
        Ilawsuit ilawsuit=new XiaoMing();
        Lawyer lawyer=new Lawyer(ilawsuit);
/*
        //通过代理执行方法
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();*/

        //构建Ilawsuit的动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(ilawsuit);
        ClassLoader classLoaderIlawsuit = ilawsuit.getClass().getClassLoader();
        Ilawsuit proxyIlawsuit = (Ilawsuit) Proxy.newProxyInstance(classLoaderIlawsuit,new Class[]{Ilawsuit.class},dynamicProxy);

        proxyIlawsuit.submit();
        proxyIlawsuit.burden();
        proxyIlawsuit.defend();
        proxyIlawsuit.finish();

        //构建IDataChange的动态代理

        IDataChange iDataChange=new IDataChangeImpl();
        DynamicProxy iDataChangeProxy = new DynamicProxy(iDataChange);

        ClassLoader classLoaderIDataChange = iDataChange.getClass().getClassLoader();
        IDataChange proxyIDataChange = (IDataChange) Proxy.newProxyInstance(classLoaderIDataChange,new Class[]{IDataChange.class},iDataChangeProxy);

        proxyIDataChange.insert();
        proxyIDataChange.update();

    }
}
