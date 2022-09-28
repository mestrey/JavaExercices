package ru.mirea.pr10.editors.text;

import ru.mirea.pr10.editors.framework.Editor;

public class TextEditor {
    public static void main(String[] args) {
        new Editor("TextEditor", new CreateTextDocument());
    }
}
