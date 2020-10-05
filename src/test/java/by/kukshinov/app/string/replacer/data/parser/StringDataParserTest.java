package by.kukshinov.app.string.replacer.data.parser;

import by.kukshinov.app.string.replacer.data.entity.InputModel;
import org.junit.Assert;
import org.junit.Test;

public class StringDataParserTest {
    private static final String SENTENCE = "dkssopk asokcdpasodkc osdpdkcpsok";
    private static final String RESULT_SENTENCE = "dkssopk asokcdpasodkc osdpdkcpsok";
    private static final String SOURCE_WORD_SIZE = "5";
    private static final int RESULT_WORD_SIZE = 5;
    @Test
    public void shouldParseIntSizeFromString() {
        //given
        StringDataParser stringDataParser = new StringDataParser();
        InputModel inputModel = new InputModel(SOURCE_WORD_SIZE, RESULT_SENTENCE);
        //when
        int result = stringDataParser.sizeParser(inputModel);
        //then
        Assert.assertEquals(RESULT_WORD_SIZE, result);
    }
    @Test
    public void shouldParseSentenceFromString() {
        //given
        StringDataParser stringDataParser = new StringDataParser();
        InputModel inputModel = new InputModel(SOURCE_WORD_SIZE, RESULT_SENTENCE);
        //when
        String result = stringDataParser.sentenceParser(inputModel);
        //then
        Assert.assertEquals(SENTENCE, result);
    }
}
