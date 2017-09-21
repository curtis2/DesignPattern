package com.simon.designpattern.proxypattern;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class IDataChangeImpl  implements IDataChange{

    @Override
    public void insert() {
        System.out.print("insert data to db！\n");
    }

    @Override
    public void update() {
        System.out.print("update data to db！\n");
    }


}
