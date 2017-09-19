package com.example.iteratorpattern.Test2;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Test {
    public static void main(String[] strs){
        //构建不同的处理者对象
        Leader boss=new Boss();
        Leader manager=new Manager();
        Leader director=new Director();
        Leader groupLeader=new GroupLeader();

        //指定每个节点的下一个处理者对象
        groupLeader.nextHandler=director;
        director.nextHandler=manager;
        manager.nextHandler=boss;

        //发起请求，从链条的首端开始
        groupLeader.handleRequest(9000);


    }
}
