package com.example.singleton;

/**
  饿汉式单例：


 */
public class HungrySingleton {
    private static  final HungrySingleton mInstance=new HungrySingleton();

    private HungrySingleton(){
    }

    public static  HungrySingleton getInstance(){
        return mInstance;
    }

}
