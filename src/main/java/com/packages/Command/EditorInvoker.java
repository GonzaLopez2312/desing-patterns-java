package com.packages.Command;

import java.util.Stack;

public class EditorInvoker {

    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand(){
        if (!history.isEmpty()){
            Command last = history.pop();
            last.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
