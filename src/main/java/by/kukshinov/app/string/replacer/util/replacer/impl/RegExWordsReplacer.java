package by.kukshinov.app.string.replacer.util.replacer.impl;

import by.kukshinov.app.string.replacer.util.replacer.WordsReplacer;
import by.kukshinov.app.string.replacer.util.searcher.PatternSearcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExWordsReplacer implements WordsReplacer {
    private final String sentence;
    private final String removalPattern;

    private String getResultSentence(Matcher matcher, String result) {
	   String foundOne;
	   while (matcher.find()){
		  foundOne = matcher.group();
		  switch (foundOne.charAt(foundOne.length() - 1)) {
			 case ',': result = matcher.replaceFirst(" ,");break;
			 case '.': result = matcher.replaceFirst(" .");break;
			 case '?': result = matcher.replaceFirst(" ?");break;
			 case '!': result = matcher.replaceFirst(" !");break;
			 default: result = matcher.replaceFirst("  ");break;
		  }
		  matcher.reset(result);
	   }
	   return result;
    }

    public RegExWordsReplacer(String sentence, int size) {
	   this.sentence = sentence;
	   this.removalPattern = "\\s([b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z])\\w{" + (size - 1) + "," + (size - 1) + "}[\\W]";
    }


    @Override
    public String result() {
	   Pattern pattern = Pattern.compile(removalPattern);
	   Matcher matcher = pattern.matcher(sentence);
	   String result = null;
	   result = getResultSentence(matcher, result);
	   if(result == null) {
	       return sentence;
	   } else {
	       return result;
	   }
    }

}
