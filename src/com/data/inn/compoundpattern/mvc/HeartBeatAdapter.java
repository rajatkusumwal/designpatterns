package com.data.inn.compoundpattern.mvc;

import com.data.inn.compoundpattern.mvc.domain.BeatModel;

public class HeartBeatAdapter implements Controller{

    BeatModel heartBeatModel;

    View view;

    @Override
    public void updateBeat(int bpm) {

        heartBeatModel.setBpm(bpm);
    }

    @Override
    public void increaseVolume(int volume) {

        System.out.println("Heart has no volume");
    }

    @Override
    public void start() {
        heartBeatModel.startMonitoring();
    }

    @Override
    public void stop() {
        heartBeatModel.startMonitoring();
    }

}
