package by.kukshinov.app.string.replacer.util.factory.imp;

import by.kukshinov.app.string.replacer.util.factory.WordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;
import by.kukshinov.app.string.replacer.util.replacer.impl.RegExWordsReplacer;

public class RegExWordsReplacerCreator implements WordsReplacerCreator {
    private final String sentence;
    private final int wordSize;

    public RegExWordsReplacerCreator(String sentence, int wordSize) {
	   this.sentence = sentence;
	   this.wordSize = wordSize;
    }

    @Override
    public WordsReplacer createWordReplacer() {
	   return new RegExWordsReplacer(sentence, wordSize);
    }
}
