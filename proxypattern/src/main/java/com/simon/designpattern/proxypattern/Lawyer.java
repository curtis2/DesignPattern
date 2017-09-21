package com.simon.designpattern.proxypattern;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class Lawyer implements Ilawsuit {
    //静态代理需要持有被代理者类
    private Ilawsuit xiaoMing;

    public Lawyer(Ilawsuit xiaoMing) {
        this.xiaoMing = xiaoMing;
    }

    @Override
    public void submit() {
        xiaoMing.submit();
    }

    @Override
    public void burden() {
        xiaoMing.burden();
    }

    @Override
    public void defend() {
        xiaoMing.defend();
    }

    @Override
    public void finish() {
        xiaoMing.finish();
    }
}
