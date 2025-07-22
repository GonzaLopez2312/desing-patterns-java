package com.packages;


import com.packages.Command.*;
import com.packages.Proxy.Account;
import com.packages.Proxy.BankAccount;
import com.packages.Proxy.ProxyAccount;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

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