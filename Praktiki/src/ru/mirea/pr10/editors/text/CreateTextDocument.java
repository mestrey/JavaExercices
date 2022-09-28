package ru.mirea.pr10.editors.text;

import ru.mirea.pr10.editors.framework.ICreateDocument;
import ru.mirea.pr10.editors.framework.IDocument;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument("newFile");
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument("openFile");
    }
}
