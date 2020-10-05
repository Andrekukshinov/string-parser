package by.kukshinov.app.string.replacer.util.searcher;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PatternSearcherTest {
    private final static String SOURCE_SENTENCE = "Van and Billy are friends who are going to block.";
    private final static String[] TO_COMPARE = {"Billy", "going", "block"};

    @Test
    public void shouldSplitSentenceAndReturnConsonantWordsOfSpecifiedLength() {
        //given
	   PatternSearcher searcher = new PatternSearcher(SOURCE_SENTENCE, 5);
	   //when
	   String[] result = searcher.wordsToBeRemoved();
	   //then
	   Assert.assertArrayEquals(TO_COMPARE, result);
    }
}
