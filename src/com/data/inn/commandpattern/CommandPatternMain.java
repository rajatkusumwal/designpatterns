package com.data.inn.commandpattern;

import com.data.inn.commandpattern.command.LightOffCommand;
import com.data.inn.commandpattern.command.LightOnCommand;
import com.data.inn.commandpattern.domain.Light;
import com.data.inn.commandpattern.remote.Remote;

/**
 * Client(Remote Loader) binds the invoker with the command.
 */
public class CommandPatternMain {

    public void run() {

        Remote remote = new Remote();
        LightOnCommand lightOnCommand = new LightOnCommand( new Light("Kitchen light"));
        LightOffCommand lightOffCommand = new LightOffCommand( new Light("Kitchen light"));


        remote.setCommands( 0, lightOnCommand, lightOffCommand );

        remote.pushOn( 0 );
        remote.undo( );

    }
}
