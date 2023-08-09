package com.data.inn.iteratorandcompositionpattern.composition.domain;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenus(){

        allMenus.print();
    }
}
