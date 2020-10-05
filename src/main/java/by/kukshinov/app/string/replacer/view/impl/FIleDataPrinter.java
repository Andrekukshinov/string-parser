package by.kukshinov.app.string.replacer.view.impl;

import by.kukshinov.app.string.replacer.view.DataPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FIleDataPrinter implements DataPrinter {
    private final String filePath;

    public FIleDataPrinter(String filePath) {
	   this.filePath = filePath;
    }

    @Override
    public void print(String original, String updated) throws IOException {
	   try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
	       writer.write("Start sentence is: " + original);
	       writer.write("Processed sentence is: " + updated);
	   }
    }
}
