package com.data.inn.compoundpattern.mvc;

public interface Controller {

    void updateBeat(int bpm);

    void increaseVolume(int volume);

    void start();

    void stop();
}
