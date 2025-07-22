package com.packages.Command;

public class WriteCommand implements Command {

    private TextEditor textEditor;
    private String text;

    public WriteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    public void execute() {
        textEditor.write(this.text);
    }

    public void undo(){
        textEditor.deleteLast(text.length());
    }
}
