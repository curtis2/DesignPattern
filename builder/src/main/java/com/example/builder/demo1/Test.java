package com.example.builder.demo1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com


 */
public class Test {

    public static void main(String[] strs){
        //构造器
        Builder builder=new MacBookBuilder();
        //Director
        Director pcDirector=new Director(builder);
        //封装构建过程
        pcDirector.construct("英特尔主板","Retina显示器");

        //构建计算器，输出相关信息
        System.out.println("Computer Info:" +builder.build().toString());

    }
}
