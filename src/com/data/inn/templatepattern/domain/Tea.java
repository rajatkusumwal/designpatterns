package com.data.inn.templatepattern.domain;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println(" Tea is brewing. ");
    }

    @Override
    void addCondiments() {
        System.out.println(" Adding lemon. ");
    }

    @Override
    public boolean hook(){

        return false;
    }
}
