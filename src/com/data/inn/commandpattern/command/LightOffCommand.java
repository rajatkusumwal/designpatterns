package com.data.inn.commandpattern.command;

import com.data.inn.commandpattern.domain.Command;
import com.data.inn.commandpattern.domain.Light;

/**
 * Concrete command classes
 */
public class LightOffCommand implements Command {

    public LightOffCommand(Light light) {
        this.light = light;
    }

    Light light;

    @Override
    public void execute() {
        light.off( );
    }

    @Override
    public void undo() {
        light.on( );
    }
}
