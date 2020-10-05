package by.kukshinov.app.string.replacer.util.searcher;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearcher {
    private final String removalPattern;
    private final String source;

    private String getWordToInsert(Matcher matcher) {
	   String temp = matcher.group();
	   if (temp.charAt(temp.length() - 1) == ',' || temp.charAt(temp.length() - 1) == '.') {
		  temp = temp.substring(0, temp.length() - 1);
	   }
	   return temp;
    }
    private String[] getResult(StringBuilder builder) {
	   if (builder.toString().length() > 0) {
		  builder.deleteCharAt(0);
		  String split = builder.toString();
		  return split.split("\\s+");
	   } else {
		  String split = builder.toString();
		  return split.split("");
	   }
    }

    public PatternSearcher(String source, int size) {
	   this.source = source;
	   this.removalPattern = "\\s([b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z])\\w{" + (size - 1) + "," + (size - 1) + "}($|\\s|\\.|\\,)";
    }
    public String[] wordsToBeRemoved() {
	   StringBuilder builder = new StringBuilder();
	   Pattern pattern = Pattern.compile(removalPattern);
	   Matcher matcher = pattern.matcher(source);
	   
	   while (matcher.find()) {
		  String temp = getWordToInsert(matcher);
		  builder.append(temp);
	   }
	   return getResult(builder);
    }


}
