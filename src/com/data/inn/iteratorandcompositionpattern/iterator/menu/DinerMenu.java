package com.data.inn.iteratorandcompositionpattern.iterator.menu;

import com.data.inn.iteratorandcompositionpattern.iterator.domin.MenuItem;
import com.data.inn.iteratorandcompositionpattern.iterator.iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu<MenuItem>{

    MenuItem[] items = new MenuItem[7];

    int index = 0;

    @Override
    public Iterator<?> createIterator() {
        return new DinerMenuIterator( items );
    }

    public void add(MenuItem item){

        items[index++] = item;
    }
}
