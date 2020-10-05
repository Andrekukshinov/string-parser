package by.kukshinov.app.string.replacer.data.acquirer.impl;

import by.kukshinov.app.string.replacer.data.acquirer.DataAcquirer;
import by.kukshinov.app.string.replacer.data.entity.InputModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    private final String filePath;

    public FileDataAcquirer(String filePath) {
	   this.filePath = filePath;
    }

    public InputModel getData() throws IOException {
        InputModel model;
        String wordSize = "";
        String currentString = "";
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            wordSize = reader.readLine();
		  while ((currentString = reader.readLine())!= null) {
		      builder.append(currentString);
		  }
	   }
	   return new InputModel(wordSize, builder.toString());
    }

}
