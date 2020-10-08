package by.kukshinov.app.string.replacer.data.acquirer;

import by.kukshinov.app.string.replacer.data.entity.InputModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataAcquirer {
    InputModel getData() throws IOException;
}
