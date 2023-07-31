package com.data.inn.commandpattern.command;

import com.data.inn.commandpattern.domain.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command execution");
    }

    @Override
    public void undo() {
        System.out.println("No command execution");
    }
}
