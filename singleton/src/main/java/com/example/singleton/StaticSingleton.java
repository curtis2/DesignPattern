package com.example.singleton;

/**
   静态内部类单例模式
  当第一次加载StaticSingleton类时并不会初始化sInstance,只有在第一次调用Singleton的方法的
  getInstance方法时才会导致sInstance被初始化。因此第一次调用getInstance方法会导致虚拟机加载StaticSingletonHolder类，
  这种方式不仅能够确保线程安全，也能够保证单例对象的唯一性，同时也延迟加载了单例的初始化。

 */
public class StaticSingleton {

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.sInstance;
    }

    private static class StaticSingletonHolder{
        private static final StaticSingleton sInstance=new StaticSingleton();
    }


}
