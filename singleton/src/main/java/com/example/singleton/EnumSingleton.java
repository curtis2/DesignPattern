package com.example.singleton;

/**
  枚举单例
   写法简单是枚举单例最大的优点，枚举和普通的类一样，不但能够有字段，还能够有自己的方法。最重要的是默认枚举实例的创建是线程安全的，并且在任何情况下都是一个实例
   其他几种单例模式，在反序列话的情况下会重新创建对象。

   通过反序列化可以将一个实例对象写入磁盘，然后再读取出来。从而有效的获得一个实例。即使构造函数是私有的，反序列化依然可以通过特殊的方式去创建类的一个新的实例，
   相当于调用该类的构造函数。

   反序列化操作提供了一个很特别的钩子函数，这个函数可以让开发人员控制对象的反序列化。如果要避免单例类在对象的反序列化创建新的对象,必须加入如下方法：

    private Object readResolve()throws ObjectStreamException {
     return sInstance;
   }
  也就是在readResolve方法中将sInstance对象返回，而不是默认生成一个新的对象。而对于枚举，并不存在这个问题，即使反序列化也不会生成新的对象。


 */

public enum EnumSingleton {
    INSTANCE;
    public void doSomething(){
        System.out.println("do sth");
    }

}
