package by.kukshinov.app.string.replacer.data.acquirer;

import by.kukshinov.app.string.replacer.data.entity.InputModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataAcquirer {
    //todo return an entity for size and sentence
    //todo create packages based on layer type
    InputModel getData() throws IOException;
}
