package com.data.inn.adapterandfacadepattern.fascade;

import com.data.inn.adapterandfacadepattern.fascade.domain.AirCondition;
import com.data.inn.adapterandfacadepattern.fascade.domain.Movie;
import com.data.inn.adapterandfacadepattern.fascade.domain.Popcorn;

public class FacadePatternMain {

    public void run(){

        Movie movie = new Movie();

        AirCondition aircon = new AirCondition();

        Popcorn popcorn = new Popcorn();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(aircon, movie, popcorn);

        homeTheaterFacade.watchMovie();

        homeTheaterFacade.endMovie();
    }

}
