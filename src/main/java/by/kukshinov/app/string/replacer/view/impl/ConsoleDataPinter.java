package by.kukshinov.app.string.replacer.view.impl;

import by.kukshinov.app.string.replacer.view.DataPrinter;

public class ConsoleDataPinter implements DataPrinter {
    @Override
    public void print(String original, String updated) {
	   System.out.println("Start sentence is: " + original);
	   System.out.println("Processed sentence is: " + updated);
    }
}
