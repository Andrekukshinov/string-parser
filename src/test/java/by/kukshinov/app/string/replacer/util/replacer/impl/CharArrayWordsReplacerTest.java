package by.kukshinov.app.string.replacer.util.replacer.impl;


import org.junit.Assert;
import org.junit.Test;

public class CharArrayWordsReplacerTest  {
    private final static String SOURCE_SENTENCE = "Andre and Billy Silly are friends. Silly kkk.";
    private final static String RESULT_SENTENCE = "Andre and   are friends.  kkk.";
    public static final int WORDS_LENGTH = 5;
    @Test
    public void shouldReturnSentenceWithoutWordsOfLength() {
        //given
	   CharArrayWordsReplacer replacer = new CharArrayWordsReplacer(SOURCE_SENTENCE, WORDS_LENGTH);
	   //when
	   String result = replacer.parsedString();
	   //then
	   Assert.assertEquals(RESULT_SENTENCE,result);
    }
}
