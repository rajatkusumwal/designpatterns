package com.data.inn.iteratorandcompositionpattern.composition.domain;

// Leaf node
public class MenuItem extends MenuComponent{

    public MenuItem(String name, String description, boolean isVegetarian, int price) {
        super(name, description, isVegetarian, price);
    }

    @Override
    public void print() {
        System.out.println("Name: "+ getName());
        System.out.println("Description: "+ getDescription());
        System.out.println("isVegetarian: "+ isVegetarian());
        System.out.println("Price: "+ getPrice());
        System.out.println( "------------------------------------------- " );
    }
}
