package by.kukshinov.app.string.replacer.data.parser;


import by.kukshinov.app.string.replacer.data.entity.InputModel;

public class StringDataParser {
    private static final String PREFIX = "Sentence: ";

    public int sizeParser(InputModel model) {
	   try {
		  return Integer.parseInt(model.getWordLength());
	   } catch (NumberFormatException e) {
	       throw new RuntimeException("Size must be a positive number! ");
	   }

    }

    public String sentenceParser(InputModel model) {
	   String result = model.getSentence();
	   return result;
    }
}
