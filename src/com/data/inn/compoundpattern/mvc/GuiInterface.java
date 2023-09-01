package com.data.inn.compoundpattern.mvc;

// Composite Patten in the view
public interface GuiInterface {

    void display();

    void interact(int bpm,int volume);

    void start();

    void stop();
}
