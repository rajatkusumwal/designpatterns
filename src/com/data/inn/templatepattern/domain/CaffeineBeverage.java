package com.data.inn.templatepattern.domain;

public abstract class CaffeineBeverage {

    final public void prepareDrink(){

        boilWater();
        brew();
        if( hook() ){

            addCondiments();
        }
        pourInCup();
    }

    final public void boilWater(){
        System.out.println("Boiling water");
    }

    final public void pourInCup(){
        System.out.println("Pouring in cup");
    }

    abstract void brew();

    abstract void addCondiments();

    /**
     * Optional method part of the template algorithm were teh framework user can add
     * additional callable hooks.
     */
    public boolean hook(){

        // By default the hook is true but a framework user can decide to override this.
        return true;
    }

}
