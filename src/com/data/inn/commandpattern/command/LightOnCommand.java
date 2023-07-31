package com.data.inn.commandpattern.command;

import com.data.inn.commandpattern.domain.Command;
import com.data.inn.commandpattern.domain.Light;

public class LightOnCommand implements Command {

    public LightOnCommand(Light light) {
        this.light = light;
    }

    Light light;

    @Override
    public void execute() {
        light.on( );
    }

    @Override
    public void undo() {
        light.off( );
    }
}
