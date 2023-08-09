package com.data.inn.iteratorandcompositionpattern.composition.domain;

public abstract class MenuComponent {

    String name;

    String description;

    boolean isVegetarian;

    int price;

    public MenuComponent(String name, String description, boolean isVegetarian, int price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public MenuComponent(){
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getPrice() {
        return price;
    }

    public void add( MenuComponent subMenu ){

        throw new UnsupportedOperationException();
    }

    public void remove( int n ){

        throw new UnsupportedOperationException();
    }

    public void getChild( int n ){

        throw new UnsupportedOperationException();
    }

    public void print( ){

        throw new UnsupportedOperationException();
    }
}
