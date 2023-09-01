package com.data.inn.compoundpattern.mvc;

import com.data.inn.compoundpattern.mvc.domain.BeatModel;

public class MvcPatternMain {

    public void run(){

        BeatModel beatModel = new BeatModel(100, 100);
        Controller controller = new BeatController(beatModel);

        View childView = new View(controller, "Child View");
        View parentView = new View(controller, "Parent View");
        parentView.compositeViews.add(childView);

        beatModel.registerObserver(parentView);

        parentView.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parentView.interact(200, 200);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parentView.stop();


    }
}
