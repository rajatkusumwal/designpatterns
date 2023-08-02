package com.data.inn.adapterandfacadepattern.fascade;

import com.data.inn.adapterandfacadepattern.fascade.domain.AirCondition;
import com.data.inn.adapterandfacadepattern.fascade.domain.Movie;
import com.data.inn.adapterandfacadepattern.fascade.domain.Popcorn;

public class HomeTheaterFacade {

    AirCondition airCondition;

    Movie movie;

    Popcorn popcorn;

    HomeTheaterFacade( AirCondition airCondition, Movie movie, Popcorn corn){

        this.airCondition = airCondition;
        this.movie = movie;
        this.popcorn = corn;
    }

    // Handling multiple subsystems
    public void watchMovie(){

        popcorn.cook();
        airCondition.turnOn();
        movie.turnOn();
    }

    public void endMovie(){

        movie.turnOff();
        airCondition.turnOff();
        popcorn.trash();
    }

}
