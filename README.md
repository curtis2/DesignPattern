# DesignPattern
整理23种设计模式设计原理，使用场景，以及实现方式和实战

 **责任链模式**
 
 ![这里写图片描述](http://img.blog.csdn.net/20170919161341675?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbmlnaHRjdXJ0aXM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

> - 定义1：   是行为型设计模式之一 。 什么是" 链 "?   我们将多个节点首尾相连所构成的模型称为链，比如生活中的锁链，就是由一个个圆角长方形的铁环串起来的结构。 对于链式结构，每个节点可以被拆开再连接，因此，链式结构也具有很好的灵活性。将这样的一种结构应用于编程领域，   将一个节点看成一个对象，每一个对象都拥有不同的处理逻辑，将一个请求从链式的首端发出，沿着链的路径依次传递到每一个节点对象，直到有对象处理这个请求为止。
> 
> -  定义2：   使多个对象都有机会处理请求，从而避免了请求的发起者和接收者之间的耦合关系，将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。

  优势：
    1.请求的发起可以从节点的任何一个节点开始，同时也可以改变内部的传递规则，比如Test2中，主管不在，可以直接上报给经理（指定小组长的下一个节点为经理）。
    2.解除了处理对象和请求者对象的耦合，可以灵活的增加和减少处理节点
    
   不足：
    责任链模式的不足在于对链中请求处理者的遍历，如果处理者太多那么遍历必定会影响性能，特别是在一些递归调用中，要慎重。

   注意事项：
    1. 对于责任链中的一个处理者对象，其只有两个行为，一是处理请求，二是将请求转送到下一个节点，不允许某个处理者对象在处理了请求后又将请求转送给上一个节点的情况
    2. 对于一条责任链模式来说，一个请求最终只有两种情况，一是被某个对象所处理，另一个就是所有的对象均未对其处理，对于前一种情况我们称该责任链模式为纯的责任链模式，对于后一种情况我们称为不纯的责任链模式


----------
