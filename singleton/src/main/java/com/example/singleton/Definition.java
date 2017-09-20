package com.example.singleton;


/**
  单例模式：

  定义：
    确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

  使用场景：
     确保某个类有且只有一个对象的场景，避免产生多个对象消耗过多的资源，或者某种类型的对象只应该有且只有一个。
    例如,创建一个对象需要消耗的资源过多，如要访问IO和数据库等资源。


  构建单例类的4个关键点：
  1.构造函数不对外开放，一般为private
  2.通过一个静态方法或者枚举返回单例类的实例
  3.保证单例类的对象有且只有一个，尤其是在多线程的情况下
  4.确保单例类的对象在反序列化的时候不会重新构造对象

 */
public class Definition {
}