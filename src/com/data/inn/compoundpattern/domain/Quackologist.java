package com.data.inn.compoundpattern.domain;

public class Quackologist implements Observer{
    @Override
    public void update() {
        System.out.println("Observer Called from " + Thread.currentThread().getStackTrace()[4].getClassName() );
    }
}
