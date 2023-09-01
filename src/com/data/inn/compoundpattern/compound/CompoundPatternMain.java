package com.data.inn.compoundpattern.compound;

import com.data.inn.compoundpattern.compound.domain.AbstractDuckFactory;
import com.data.inn.compoundpattern.compound.domain.CountingDuckFactory;
import com.data.inn.compoundpattern.compound.domain.Flock;
import com.data.inn.compoundpattern.compound.domain.Quackologist;

public class CompoundPatternMain {

public void run(){

    Flock flock = new Flock();

    AbstractDuckFactory duckFactory = new CountingDuckFactory();

    flock.add( duckFactory.createMallardDuck() );
    flock.add( duckFactory.createRubberDuck() );
    flock.add( duckFactory.createGoose() );

    simulate( flock );

}

public void simulate(Flock flock){

    System.out.println("Simulate");

    Quackologist quackologist = new Quackologist();
    flock.registerObserver(quackologist);
    flock.quack();
    flock.notifyObserver();
}


}
