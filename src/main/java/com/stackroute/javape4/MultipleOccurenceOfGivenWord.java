package com.stackroute.javape4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceOfGivenWord {

    String multipleOccurenceOfGivenWord(String original,String word) {
        if(original==null)
        {
            return "This is invalid";
        }
        String result="";
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("(" + word + ")+");

        // Search above pattern in the input string
        Matcher matcher = pattern.matcher(original);

        //Find starting and ending indexes of the pattern in text
        while (matcher.find()) {
            result= result+ "Found At " + matcher.start() + "-" + (matcher.end() - 1)+"\n";
        }
        return result.trim();
    }

}
