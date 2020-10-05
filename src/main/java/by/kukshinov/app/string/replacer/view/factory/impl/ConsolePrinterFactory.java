package by.kukshinov.app.string.replacer.view.factory.impl;

import by.kukshinov.app.string.replacer.view.DataPrinter;
import by.kukshinov.app.string.replacer.view.factory.DataPrinterFactory;
import by.kukshinov.app.string.replacer.view.impl.ConsoleDataPinter;

public class ConsolePrinterFactory implements DataPrinterFactory {
    @Override
    public DataPrinter createDataPrinter() {
	   return new ConsoleDataPinter();
    }
}
