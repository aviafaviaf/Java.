package n24.n3.TextDocument;

import n24.n3.ICreateDocument;
import n24.n3.IDocument;

import java.io.File;
import java.io.IOException;

public class CreateTextDocument implements ICreateDocument {
    public IDocument createNew(String path) throws IOException {
        File file = new File(path + ".txt");
        if (!file.createNewFile()) {
            if (file.delete()) {
                createNew(path);
            }
        }
        return new TextDocument(file);
    }

    public IDocument createOpen(String path) {
        return new TextDocument(new File(path + ".txt"));
    }
}
