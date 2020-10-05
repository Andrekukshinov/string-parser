package by.kukshinov.app.string.replacer.util.factory.imp;

import by.kukshinov.app.string.replacer.util.factory.WordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;
import by.kukshinov.app.string.replacer.util.replacer.impl.StringMethodWordsReplacer;
import by.kukshinov.app.string.replacer.util.searcher.PatternSearcher;

public class StringMethodsWordsReplacerCreator implements WordsReplacerCreator {
    private final String sentence;
    private final PatternSearcher searcher;

    public StringMethodsWordsReplacerCreator(String sentence, PatternSearcher searcher) {
	   this.sentence = sentence;
	   this.searcher = searcher;
    }

    @Override
    public WordsReplacer createWordReplacer() {
	   return new StringMethodWordsReplacer(sentence, searcher);
    }
}
