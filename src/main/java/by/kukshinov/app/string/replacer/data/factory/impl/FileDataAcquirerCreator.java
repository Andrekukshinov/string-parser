package by.kukshinov.app.string.replacer.data.factory.impl;

import by.kukshinov.app.string.replacer.data.acquirer.DataAcquirer;
import by.kukshinov.app.string.replacer.data.acquirer.impl.FileDataAcquirer;
import by.kukshinov.app.string.replacer.data.factory.DataAcquirerCreator;

public class FileDataAcquirerCreator implements DataAcquirerCreator {
    private static final String FILE_PATH = "readFrom.txt";
    @Override
    public DataAcquirer createDataAcquirer() {
	   return new FileDataAcquirer(FILE_PATH);
    }
}
