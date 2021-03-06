package by.kukshinov.app.string.replacer.application;

import by.kukshinov.app.string.replacer.data.acquirer.DataAcquirer;
import by.kukshinov.app.string.replacer.data.entity.InputModel;
import by.kukshinov.app.string.replacer.data.factory.DataAcquirerCreator;
import by.kukshinov.app.string.replacer.data.factory.impl.FileDataAcquirerCreator;
import by.kukshinov.app.string.replacer.data.parser.StringDataParser;
import by.kukshinov.app.string.replacer.util.factory.WordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.factory.imp.CharArrayWordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.factory.imp.RegExWordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.factory.imp.StringMethodsWordsReplacerCreator;
import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;
import by.kukshinov.app.string.replacer.util.replacer.impl.StringMethodWordsReplacer;
import by.kukshinov.app.string.replacer.util.searcher.PatternSearcher;
import by.kukshinov.app.string.replacer.view.DataPrinter;
import by.kukshinov.app.string.replacer.view.impl.ConsoleDataPinter;

import java.io.IOException;

public class StringReplacerApplication {
    public static void main(String[] args) throws IOException {
        DataAcquirerCreator acquirerCreator = new FileDataAcquirerCreator();
        DataAcquirer acquirer = acquirerCreator.createDataAcquirer();
        StringDataParser parser = new StringDataParser();
        InputModel source = acquirer.getData();
        int size = parser.sizeParser(source);
        String sentence = parser.sentenceParser(source);
        PatternSearcher searcher = new PatternSearcher(sentence, size);
        WordsReplacerCreator replacerCreator = new CharArrayWordsReplacerCreator(sentence, size);
        WordsReplacer replacer = replacerCreator.createWordReplacer();
        String replaced = replacer.parsedString();
        DataPrinter printer = new ConsoleDataPinter();
        printer.print(sentence, replaced);
    }
}

