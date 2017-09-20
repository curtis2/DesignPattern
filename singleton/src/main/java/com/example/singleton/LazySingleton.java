package com.example.singleton;

/**
  懒汉式单例：
  懒汉式单例式单例的优点是单例只有在使用的时候才会被实例化，在一定程度上节约了资源，缺点是第一次加载时需要及时的进行实例化，反应较慢，最大的问题是每次调用getInstance时候
  都进行同步，造成不必要的同步开销。这种模式不推荐使用。
 */
public class LazySingleton {

    private static  LazySingleton mInstance;

    private LazySingleton(){
    }

    public  synchronized  static LazySingleton getInstance(){
        if(mInstance==null) {
            mInstance = new LazySingleton();
        }
        return mInstance;
    }

}
