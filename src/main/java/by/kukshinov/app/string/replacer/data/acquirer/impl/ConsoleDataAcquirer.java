package by.kukshinov.app.string.replacer.data.acquirer.impl;

import by.kukshinov.app.string.replacer.data.acquirer.DataAcquirer;
import by.kukshinov.app.string.replacer.data.entity.InputModel;

import java.io.*;

public class ConsoleDataAcquirer implements DataAcquirer {
    private String getSentence(BufferedReader reader) throws IOException {
	   System.out.println("Input sentence");
	   return reader.readLine();
    }
    private String getWordLength(BufferedReader reader) throws IOException {
	   System.out.println("Set words to be deleted length");
	   return reader.readLine();
    }
    @Override
    public InputModel getData() throws IOException {
        String sentence = "";
        String wordSize = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
		  wordSize = getWordLength(reader);
		  sentence = getWordLength(reader);
	   }
	   return new InputModel(wordSize, sentence);
    }
}
