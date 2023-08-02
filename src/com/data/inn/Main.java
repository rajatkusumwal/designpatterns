package com.data.inn;


import com.data.inn.adapterandfacadepattern.adapter.AdapterPatternMain;
import com.data.inn.adapterandfacadepattern.fascade.FacadePatternMain;

public class Main {

    public static void main(String args[]){
//        CommandPatternMain commandPattern = new CommandPatternMain();
//        commandPattern.run();

//        AdapterPatternMain adapterPatternMain = new AdapterPatternMain();
//        adapterPatternMain.run();

        FacadePatternMain facadePatternMain = new FacadePatternMain();
        facadePatternMain.run();

    }
}
