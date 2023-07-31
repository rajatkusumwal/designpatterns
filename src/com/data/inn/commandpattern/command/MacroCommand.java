package com.data.inn.commandpattern.command;

import com.data.inn.commandpattern.domain.Command;

import java.util.ArrayList;

/**
 * Macro command is a special case which can handle multiple commands.
 */
public class MacroCommand implements Command {

    ArrayList<Command> commands;

    @Override
    public void execute() {
        for(Command command: commands){

            command.execute();
        }
    }

    @Override
    public void undo() {

        for(Command command: commands){

            command.undo();
        }
    }


}
