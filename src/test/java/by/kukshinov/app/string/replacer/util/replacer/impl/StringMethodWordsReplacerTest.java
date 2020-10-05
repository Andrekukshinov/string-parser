package by.kukshinov.app.string.replacer.util.replacer.impl;


import by.kukshinov.app.string.replacer.util.searcher.PatternSearcher;
import org.junit.Assert;
import org.junit.Test;

public class StringMethodWordsReplacerTest {
    private final static String SOURCE_SENTENCE = "Andre and Billy are friends.";
    private final static String RESULT_SENTENCE = "Andre and  are friends.";
    public static final int WORDS_LENGTH = 5;

    @Test
    public void shouldReplaceAllTheWords() {
        //given
	   PatternSearcher searcher = new PatternSearcher(SOURCE_SENTENCE, WORDS_LENGTH);
	   StringMethodWordsReplacer replacer = new StringMethodWordsReplacer(SOURCE_SENTENCE, searcher);
	   //when
	   String result = replacer.result();
	   //then
	   Assert.assertEquals(RESULT_SENTENCE,result);
    }

}
