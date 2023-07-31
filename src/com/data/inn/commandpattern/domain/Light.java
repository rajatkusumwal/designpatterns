package com.data.inn.commandpattern.domain;

public class Light {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){

        System.out.println("Light "+ name +" On");
    }

    public void off(){

        System.out.println("Light "+ name +" Off");
    }
}
