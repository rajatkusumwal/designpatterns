package com.data.inn.iteratorandcompositionpattern.iterator.domin;

import com.data.inn.iteratorandcompositionpattern.iterator.menu.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Client
// Can on only iterate and has no idea about the storage of the objects.
public class Waitress {

    List<Menu> menus = new ArrayList<>();

    public void printMenus(){

        for( Menu menu: menus ){

            Iterator<MenuItem> items = menu.createIterator();

            while(items.hasNext()){

                MenuItem item = items.next();
                System.out.println( item.getName() );
            }
        }
    }

    public void add( Menu menu ){

        menus.add( menu );
    }

}
