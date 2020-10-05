package by.kukshinov.app.string.replacer.util.replacer.impl;

import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;
import by.kukshinov.app.string.replacer.util.searcher.PatternSearcher;

public class StringMethodWordsReplacer implements WordsReplacer {
    private final String sourceSentence;
    private final PatternSearcher searcher;

    public StringMethodWordsReplacer(String sourceSentence, PatternSearcher searcher) {
	   this.sourceSentence = sourceSentence;
	   this.searcher = searcher;
    }

    @Override
    public String result() {
	   String[] wordsToReplace = searcher.wordsToBeRemoved();
        String result = sourceSentence;
	   for (String s : wordsToReplace) {
		  result = (result.replace(s, ""));
	   }
	   return result;
    }
}
