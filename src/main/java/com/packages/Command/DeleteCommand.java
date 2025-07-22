package com.packages.Command;

public class DeleteCommand implements Command {

    private TextEditor textEditor;
    private String deletedText;

    public DeleteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void execute(){
        deletedText = textEditor.getContent();
        textEditor.deleteLast(deletedText.length());
    }

    public void undo(){
        textEditor.write(deletedText);
    }
}
