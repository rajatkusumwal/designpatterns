package com.data.inn.iteratorandcompositionpattern.composition;

import com.data.inn.iteratorandcompositionpattern.composition.domain.Menu;
import com.data.inn.iteratorandcompositionpattern.composition.domain.MenuItem;
import com.data.inn.iteratorandcompositionpattern.composition.domain.Waitress;

public class CompositePatternMain {

    public void run(){

        //Prepare data
        MenuItem item1= new MenuItem("item1", "item1 on any menu", true, 100);
        MenuItem item2= new MenuItem("item2", "item2 on any menu", true, 200);
        MenuItem item3= new MenuItem("item3", "item3 on any menu", true, 300);
        MenuItem dessertItem1= new MenuItem("ChocoLavaCake", "delicious", false, 10000);

        Menu panCakeMenu = new Menu("PanCakeMenu","Breakfast Menu by pancake maker.");
        panCakeMenu.add( item1 );
        panCakeMenu.add( item2 );
        panCakeMenu.add( item3 );

        Menu lunchMenu = new Menu("lunchMenu","Lunch Menu from lunch.");
        lunchMenu.add( item1 );
        lunchMenu.add( item2 );
        lunchMenu.add( item3 );

        Menu dinnerMenu = new Menu("PanCakeMenu","Dinner Menu for dinner.");
        dinnerMenu.add( item1 );
        dinnerMenu.add( item2 );
        dinnerMenu.add( item3 );

        Menu dessertMenu = new Menu("PanCakeMenu","Dessert Menu for dinner"); ;
        dessertMenu.add( dessertItem1 );

        // Adding the sub menu or composite whole-part
        dinnerMenu.add( dessertMenu );

        Menu allMenu = new Menu("MasterMenu","Contains all the menus and sub menus used by the waitress.");

        allMenu.add( panCakeMenu );
        allMenu.add( lunchMenu );
        allMenu.add( dinnerMenu );



        // This all we need to print all composite from the client.
        // Abstracts the client form the maintenance of the menus and sub menus.
        Waitress waitress = new Waitress( allMenu );

        waitress.printMenus();

    }

}
