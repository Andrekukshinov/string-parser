package by.kukshinov.app.string.replacer.view.factory.impl;

import by.kukshinov.app.string.replacer.view.DataPrinter;
import by.kukshinov.app.string.replacer.view.factory.DataPrinterFactory;
import by.kukshinov.app.string.replacer.view.impl.FIleDataPrinter;

public class FileDataPrinterFactory implements DataPrinterFactory {
    private static final String FILE_PATH = "writeDataTo.txt";
    @Override
    public DataPrinter createDataPrinter() {
	   return new FIleDataPrinter(FILE_PATH);
    }
}
