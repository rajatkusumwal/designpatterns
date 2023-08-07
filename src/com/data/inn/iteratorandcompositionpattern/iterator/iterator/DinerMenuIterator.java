package com.data.inn.iteratorandcompositionpattern.iterator.iterator;

import com.data.inn.iteratorandcompositionpattern.iterator.domin.MenuItem;

import java.util.Iterator;
import java.util.function.Consumer;

// Iterator
public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int index;

    public DinerMenuIterator(MenuItem[] items){

        this.items = items;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if( index < this.items.length && this.items[index] != null ){

            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {

        return this.items[index++];
    }

    @Override
    public void remove() {

        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {

        Iterator.super.forEachRemaining(action);
    }
}
