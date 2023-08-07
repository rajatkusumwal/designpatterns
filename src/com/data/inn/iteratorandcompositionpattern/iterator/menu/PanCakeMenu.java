package com.data.inn.iteratorandcompositionpattern.iterator.menu;

import com.data.inn.iteratorandcompositionpattern.iterator.domin.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

// Concrete Aggregator
public class PanCakeMenu implements Menu<MenuItem>{

    ArrayList<MenuItem> items = new ArrayList<>();

    public PanCakeMenu(){
    }

    @Override
    public Iterator<?> createIterator() {

        return items.iterator();
    }

    public void add( MenuItem item ){

        items.add( item );
    }
}
