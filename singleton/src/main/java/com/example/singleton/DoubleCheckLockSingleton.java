package com.example.singleton;

/**
   DCL方式实现单例
   DCL方式实现单例模式的优点是既能保证线程安全，并单例类初始化后不会调用同步锁，避免了同步消耗。

   原理：
     可以看到getInstance方法中对instance进行了两次判空,第一次判空主要是避免不必要的同步，第二次判断则是为了在null的情况下创建实例
    分析：
     假设线程A执行到sInstance=new Singleton()语句，这里看是一句代码，但实际上它并不是一个原子操作，这句代码最终会被编译成多条汇编指令，大致是这三件事情：
     1.给Singleton的实例分配内存
     2.调用Singleton（）的构造函数，初始化成员字段
     3.将sInstance对象指向分配的内存空间（此时sInstance就不是null了）
     但是，由于java编译器允许处理器乱序执行，以及JDK1.5之前的JMM(java Memory Model，java内存模型)中cache,寄存器到内存回写顺序规定，上面的第二和第三的顺序是无法保证的。
     也就是说，执行顺序可能是1-2-3也可能是1-3-2。如果是后者，并且在3 执行完，2没有执行的时候，被切换到线程B上，这时候sInstance因为已经在线程A内执行过了第三点，sInstance已经是非空了，
     所以，线程B直接取走sInstance，再使用就会报错。这就是DCL失效问题，而且这种难以追踪难以重现的错误很可能会隐藏很久。

    在JDk之后，SUN官方已经注意到了这个问题，调整了JVM,具体优化了volatile关键字，因此，如果JDK是1.5或者之后的版本，
    只需要将sInstance的定义改成private volatile static  DoubleCheckLockSingleton mInstance=null; 就可以保证sInstance对象每次都是从主内存中读取，就可以使用DCl的写法来完成单例模式。
    当然，volatile或多或少也会影响性能，但考虑到程序的正确性，牺牲这点性能还是值得的。

   DCL的优点：
    资源利用率高，第一次执行getInstance()的时候单例对象才会被初始化，效率高。
   缺点：
     第一次加载是反应稍慢，也由于java内存模型的原因偶尔会失败。在高并发环境下也有一定的缺陷，虽然发生的几率很小。DCL模式是使用最多的单例实现方式，。

 */

public class DoubleCheckLockSingleton {

    private static  DoubleCheckLockSingleton mInstance;

    private DoubleCheckLockSingleton(){}

    public static  DoubleCheckLockSingleton getInstance(){
        if(mInstance==null){
            synchronized (DoubleCheckLockSingleton.class){
                if(mInstance==null){
                    mInstance=new DoubleCheckLockSingleton();
                }
            }
        }
        return  mInstance;
    }

}
