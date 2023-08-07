package com.data.inn.iteratorandcompositionpattern.iterator;

import com.data.inn.iteratorandcompositionpattern.iterator.menu.DinerMenu;
import com.data.inn.iteratorandcompositionpattern.iterator.domin.MenuItem;
import com.data.inn.iteratorandcompositionpattern.iterator.menu.PanCakeMenu;
import com.data.inn.iteratorandcompositionpattern.iterator.domin.Waitress;

public class IteratorPatternMain {


    public void run(){

        Waitress waitress = new Waitress();

        // Menu
        MenuItem item1 = new MenuItem("Pancake Item1","Description 1",true);
        MenuItem item2 = new MenuItem("Pancake item2","Description 2",true);
        MenuItem item3 = new MenuItem("Diner Item3","Description 3",true);
        MenuItem item4 = new MenuItem("Diner item4","Description 4",true);

        PanCakeMenu panCakeMenu = new PanCakeMenu();
        panCakeMenu.add( item1 );
        panCakeMenu.add( item2 );

        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.add( item3 );
        dinerMenu.add( item4 );

        waitress.add( panCakeMenu );

        waitress.add( dinerMenu );

        waitress.printMenus();

    }
}
