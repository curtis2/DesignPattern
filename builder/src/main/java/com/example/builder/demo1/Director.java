package com.example.builder.demo1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com

   产品构建类
 */
public class Director {
     Builder mBuilder=null;

    /**
     *
     * @param mBuilder
     */
    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    /**
     * 构建对象
     */
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }

}
