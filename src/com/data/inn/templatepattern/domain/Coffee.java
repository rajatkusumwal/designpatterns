package com.data.inn.templatepattern.domain;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println(" Coffee is brewing. ");
    }

    @Override
    void addCondiments() {
        System.out.println(" Adding sugar and milk. ");
    }

}
