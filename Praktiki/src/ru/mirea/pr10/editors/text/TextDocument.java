package ru.mirea.pr10.editors.text;

import ru.mirea.pr10.editors.framework.IDocument;

public class TextDocument implements IDocument {
    public TextDocument(String name) {
        System.out.println("File with name: " + name);
    }

    @Override
    public void save() {
        System.out.println("File saved!");
    }
}
