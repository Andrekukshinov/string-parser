package by.kukshinov.app.string.replacer.util.factory.imp;

import by.kukshinov.app.string.replacer.util.factory.WordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;
import by.kukshinov.app.string.replacer.util.replacer.impl.CharArrayWordsReplacer;

public class CharArrayWordsReplacerCreator implements WordsReplacerCreator {
    private final String sentence;
    private final int wordSize;

    public CharArrayWordsReplacerCreator(String sentence, int wordSize) {
	   this.sentence = sentence;
	   this.wordSize = wordSize;
    }

    @Override
    public WordsReplacer createWordReplacer() {
	   return new CharArrayWordsReplacer(sentence, wordSize);
    }
}
