package com.data.inn.commandpattern.remote;

import com.data.inn.commandpattern.command.NoCommand;
import com.data.inn.commandpattern.domain.Command;

import java.util.Stack;

/**
 * Invoker that invokes the action.
 */
public class Remote {

    Command[] onCommands = new Command[7];

    Command[] offCommands = new Command[7];

    Stack<Command> executed = new Stack<>();

    public Remote(){
        for( int x=0;x<7;x++){

            onCommands[x] = new NoCommand();

            offCommands[x] = new NoCommand();
        }
    }

    public void setCommands( int slot, Command onCommand, Command offCommand ) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void pushOn( int slot ) {
        this.onCommands[slot].execute();
        executed.push(this.onCommands[slot]);
    }

    public void pushOff( int slot ) {
        this.offCommands[slot].execute();
        executed.push(this.offCommands[slot]);
    }

    public void undo() {

        executed.pop().undo();
    }

}
