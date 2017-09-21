package com.simon.designpattern.proxypattern;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class XiaoMing implements Ilawsuit {
    @Override
    public void submit() {
        System.out.print("老板拖欠工资，申请仲裁！\n");
    }

    @Override
    public void burden() {
        System.out.print("这是多去一年的合同书和银行流水！\n");
    }

    @Override
    public void defend() {
        System.out.print("证据确凿，不用讨论了！\n");
    }

    @Override
    public void finish() {
        System.out.print("诉讼成功，判决老板即日起七天内结清工资！\n");
    }
}
