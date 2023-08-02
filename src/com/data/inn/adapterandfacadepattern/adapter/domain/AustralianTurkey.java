package com.data.inn.adapterandfacadepattern.adapter.domain;

public class AustralianTurkey implements Turkey {

    @Override
    public String gobbles() {
        return "Gobble";
    }

    @Override
    public String fly() {
        return "Turkey Fly!!";
    }
}
