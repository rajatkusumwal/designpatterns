package com.data.inn.commandpattern.domain;

/**
 * Command that is executed without the decoupling the invoker from the action.
 */
public interface Command {

    void execute();

    void undo();
}
