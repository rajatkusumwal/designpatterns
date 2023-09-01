package com.data.inn.compoundpattern.mvc;

import com.data.inn.compoundpattern.mvc.domain.BeatModel;
import com.data.inn.compoundpattern.mvc.domain.Observer;

public class BeatController implements Controller, Observer {

    BeatModel beat;

    public BeatController(BeatModel beat) {
        this.beat = beat;
    }

    @Override
    public void updateBeat(int bpm) {

        beat.setBpm(bpm);
    }

    @Override
    public void increaseVolume(int volume) {

        beat.setVolume(volume);
    }

    @Override
    public void start() {
        beat.startMonitoring();
    }

    @Override
    public void stop() {
        beat.stopMonitoring();
    }

    @Override
    public void update(int bpm, int volume) {

    }
}
