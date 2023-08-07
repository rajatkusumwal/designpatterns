package com.data.inn.iteratorandcompositionpattern.iterator.menu;

import java.util.Iterator;

// Aggregator
public interface Menu<T> {

    Iterator<?> createIterator();
}
