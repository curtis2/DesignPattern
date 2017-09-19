package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Test {
    public static void main(String[] strs){
        //构建3个处理者对象
        AbstractHandler handler1=new handler1();
        AbstractHandler handler2=new handler2();
        AbstractHandler handler3=new handler3();


        //设置处理者对象下一个节点的处理者对象
        handler1.nextHandler=handler2;
        handler2.nextHandler=handler3;


        //构建不同的请求者对象
        AbstactRequest request1=new Request1("Request1");
        AbstactRequest request2=new Request2("Request2");
        AbstactRequest request3=new Request3("Request3");


        //从链式的首端发起请求
       handler1.handleRequest(request1);
       handler1.handleRequest(request2);
       handler1.handleRequest(request3);


    }
}
