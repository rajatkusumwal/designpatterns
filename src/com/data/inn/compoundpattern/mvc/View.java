package com.data.inn.compoundpattern.mvc;

import com.data.inn.compoundpattern.mvc.domain.Observer;

import java.util.ArrayList;
import java.util.List;

// Can compose multiple controllers (Strategy Pattern)
public class View implements GuiInterface, Observer {

    List<View> compositeViews;

    Controller beat;

    String name;

    public View(Controller beat, String name) {
        this.compositeViews = new ArrayList<>();
        this.beat = beat;
        this.name = name;
    }

    int bpm;

    int volume;

    @Override
    public void display() {

        System.out.println("Beat from "+name+"view: "+ getBpm()  + " "+ getVolume());
    }

    @Override
    public void interact(int bpm,int volume) {

        beat.updateBeat(bpm);
        beat.increaseVolume(volume);
    }

    @Override
    public void start() {
        beat.start();
    }

    @Override
    public void stop() {
        beat.stop();
    }

    @Override
    public void update(int bpm, int volume) {

        this.bpm = bpm;
        this.volume = volume;
        this.display();
        compositeViews.forEach(gui->gui.update(bpm,volume));
    }

    public int getBpm() {
        return bpm;
    }

    public int getVolume() {
        return volume;
    }
}
