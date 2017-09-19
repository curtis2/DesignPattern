package com.example.iteratorpattern.Test1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */
public abstract class AbstractHandler {

    protected  AbstractHandler nextHandler; //下一节点上的处理者对象
    /**
     * 处理请求
     * @param request
     */
    public final void handleRequest(AbstactRequest request){
        //如果当前处理者对象的处理级别是否与请求者对象相同，则处理这个请求
       if(getHandleLevel()==request.getRequestLevel()){
           handle(request);
       }else{
          if(nextHandler!=null){
              //否则交给下一个节点的处理者对象进行处理
              nextHandler.handleRequest(request);
          }else{
              //如果所有的处理对象都不出来这个对象or 责任链执行完成时输出
              System.out.println("all of the handlers can not handle the request or the iterator ended");
          }
       }
    }

    /**
     * 获取处理者对象的处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的具体处理方法
     */
    protected  abstract void handle(AbstactRequest request);


}
