package com.data.inn.compoundpattern.mvc.domain;

import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatObservable{

    int bpm;

    int volume;

    public int getBpm() {
        return bpm;
    }

    public int getVolume() {
        return volume;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public boolean isStop() {
        return stop;
    }

    List<Observer> observerList;

    boolean stop;

    public BeatModel(int bpm, int volume) {
        this.bpm = bpm;
        this.volume = volume;
        this.observerList= new ArrayList<>();
        this.stop = false;
    }

    @Override
    public void registerObserver(Observer observer) {

        this.observerList.add(observer);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public void stopMonitoring(){

        this.stop = true;
    }

    public void startMonitoring(){

        Thread t = new Thread(()->{

            while(!this.stop){

                this.observerList.forEach(o->o.update(this.bpm, this.volume));

                try {
                    Thread.sleep(60000/this.bpm);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
    }

}
