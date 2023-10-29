package com.data.inn.strategypattern;

import com.data.inn.strategypattern.domain.Duck;
import com.data.inn.strategypattern.domain.RedHeadDuck;
import com.data.inn.strategypattern.domain.RubberDuck;

public class StrategyPatternMain {

    public void run(){

        // Strategy lies in the constructor of the duck which can pick and choose the fly and quack behaviours.
        Duck redHead = new RedHeadDuck();
        Duck rubber = new RubberDuck();

        redHead.display();
        rubber.display();

    }


}
