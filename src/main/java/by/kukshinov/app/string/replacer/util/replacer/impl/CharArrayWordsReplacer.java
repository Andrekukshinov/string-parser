package by.kukshinov.app.string.replacer.util.replacer.impl;

import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;

public class CharArrayWordsReplacer implements WordsReplacer {
    private final char[] sentence;
    private final int wordRemovalSize;

    private int getWordRemovalSize(int runner, int sentenceLength) {
	   int currentWordLength = 0;
	   for (int wordRunner = runner; wordRunner < sentenceLength && Character.isLetter(sentence[wordRunner]); ++wordRunner) {
		  if ((wordRunner == (runner + wordRemovalSize - 1)
				&& Character.isSpaceChar(sentence[runner + wordRemovalSize - 1]))
				||(wordRunner == (runner + wordRemovalSize - 1)
				&& wordRunner + 1 == sentenceLength)) {
			 currentWordLength++;
			 break;
		  } else {
			 currentWordLength++;
		  }
	   }
	   if (currentWordLength == wordRemovalSize) {
		  return currentWordLength;
	   } else {
		  return runner;
	   }
    }
    private String parsedCharArrayToString(int sentenceLength, char[] tempArray, int resultSize, int wordEndIndex, int tempArStartIndex) {
	   System.arraycopy(sentence, wordEndIndex, tempArray, tempArStartIndex, sentenceLength - (wordEndIndex));
	   char[] result = new char[sentenceLength - resultSize];
	   System.arraycopy(tempArray, 0, result, 0, sentenceLength - resultSize);
	   return new String(result);
    }

    private static boolean isConsonant(char c) {
	   String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	   String character = String.valueOf(c);
	   return cons.contains(character);
    }

    public CharArrayWordsReplacer(String sentence, int wordRemovalSize) {
	   this.sentence = sentence.toCharArray();
	   this.wordRemovalSize = wordRemovalSize;
    }

    @Override
    public String parsedString() {
	   int sentenceLength = sentence.length;
	   char[] tempArray = new char[sentenceLength];
	   int resultSize = 0;
	   int wordEndIndex = 0;
	   int sourceArStartIndex = wordEndIndex;
	   int tempArStartIndex = wordEndIndex;
	   for (int runner = 0; runner < sentenceLength; ++runner) {
		  if (Character.isSpaceChar(sentence[runner]) && (runner + 1 != sentenceLength) && isConsonant(sentence[runner + 1])) {
			 wordEndIndex = getWordRemovalSize(runner + 1, sentenceLength);
			 if (wordEndIndex - 1 != runner) {
				System.arraycopy(sentence, sourceArStartIndex, tempArray, tempArStartIndex, runner + 1 - sourceArStartIndex);
				sourceArStartIndex = (runner + 1) + wordRemovalSize ;
				tempArStartIndex = (runner + 1) - resultSize;
				resultSize += wordRemovalSize;
			 }
		  }
	   }
	   return parsedCharArrayToString(sentenceLength, tempArray, resultSize, sourceArStartIndex, tempArStartIndex);
    }


}
