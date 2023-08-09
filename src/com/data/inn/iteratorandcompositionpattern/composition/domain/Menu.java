package com.data.inn.iteratorandcompositionpattern.composition.domain;

import java.util.ArrayList;
import java.util.List;

// Composite nodes
public class Menu extends MenuComponent {

    List<MenuComponent> subMenus = new ArrayList<>();

    public Menu(String name, String description) {
        super(name, description);
    }


    @Override
    public void add( MenuComponent subMenu ) {
        subMenus.add( subMenu );
    }

    @Override
    public void remove( int n ) {
        subMenus.remove( n );
    }

    @Override
    public void getChild(int n) {
        subMenus.get( n );
    }

    @Override
    public void print() {
        System.out.println( "Name: " + name );
        System.out.println( "Description: " + description );
        System.out.println( "------------------------------------------- " );

        subMenus.forEach(MenuComponent::print);
    }
}
