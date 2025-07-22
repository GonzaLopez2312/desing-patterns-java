package com.packages.Command;

public class TextEditor {

    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text);
        System.out.println("Text after writing: " + content.toString());
    }

    public void deleteLast(int length){
        int start = Math.max(0, content.length() - length);
        content.delete(start, content.length());
        System.out.println("Text after deleting: " + content.toString());
    }

    public String getContent(){
        return content.toString();
    }
}
