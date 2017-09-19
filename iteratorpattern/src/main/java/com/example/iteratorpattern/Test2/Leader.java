package com.example.iteratorpattern.Test2;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public abstract class Leader {

    protected Leader nextHandler; //上一级处理领导

    /**
     * 处理报账请求
     * @param money
     */
    public  final void handleRequest(int money){
        //如果申请的报账权限在自己的处理的权限内
        if(money<limit()){
            handle(money);
        }else{
            //如果不在自己处理的权限内，上报上一级进行审批
            if(nextHandler!=null){
                nextHandler.handleRequest(money);
            }
        }
    }

    /**
     * 自身能批复的额度限制
     * @return
     */
    protected abstract int limit();

    /**
     * 处理报账行为
     * @param money
     */
    public abstract void handle(int money);

}
