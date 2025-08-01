package com.packages.Command;

public class CommandMain {
    public static void main(String[] args) {

        System.out.println("\n ------ COMMAND ------ \n");

        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();

        Command writeHello = new WriteCommand(editor, "Hello ");
        Command writeWorld = new WriteCommand(editor, "World!");

        invoker.executeCommand(writeHello);
        invoker.executeCommand(writeWorld);

        invoker.undoLastCommand();
        invoker.undoLastCommand();

        Command writeAgain = new WriteCommand(editor, "Again!");
        invoker.executeCommand(writeAgain);

        Command deleteAll = new DeleteCommand(editor);
        invoker.executeCommand(deleteAll);
        invoker.undoLastCommand();

    }
}
