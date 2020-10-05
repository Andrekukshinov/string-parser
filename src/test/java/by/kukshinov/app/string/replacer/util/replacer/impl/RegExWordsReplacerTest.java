package by.kukshinov.app.string.replacer.util.replacer.impl;


import org.junit.Assert;
import org.junit.Test;

public class RegExWordsReplacerTest {
    private final static String SOURCE_SENTENCE = "Van and Billy are friends who are going to block.";
    private final static String RESULT_SENTENCE = "Van and  are friends who are  to .";
    private static final int RESULT_WORD_SIZE = 5;

    @Test
    public void shouldReturnSentenceWithoutWordsOfLength() {
        //todo fix comma and dot
        //given
	   RegExWordsReplacer regExReplacer = new RegExWordsReplacer(SOURCE_SENTENCE, RESULT_WORD_SIZE);
	   //when
	   String result = regExReplacer.parsedString();
	   //then
	   Assert.assertEquals(RESULT_SENTENCE, result);
    }
}
