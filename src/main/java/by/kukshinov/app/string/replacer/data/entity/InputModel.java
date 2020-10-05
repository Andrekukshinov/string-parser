package by.kukshinov.app.string.replacer.data.entity;

public class InputModel {
    private final String wordLength;
    private final String sentence;

    public InputModel(String wordLength, String word) {
	   this.wordLength = wordLength;
	   this.sentence = word;
    }

    public String getWordLength() {
	   return wordLength;
    }

    public String getSentence() {
	   return sentence;
    }
}
