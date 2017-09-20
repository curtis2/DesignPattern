package com.example.builder.demo1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com

 抽象Builder类
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);

    //设置显示器
    public abstract void buildDisplay(String display);

    //设置Computer
    public abstract void buildOs();

    //构建产品对象
    public abstract Computer build();
}
