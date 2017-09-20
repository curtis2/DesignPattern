package com.example.builder.demo1;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class MacBookBuilder extends Builder {

    private Computer mComputer=new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOs() {
        mComputer.setmOS();
    }

    @Override
    public Computer build() {
        return mComputer;
    }
}
