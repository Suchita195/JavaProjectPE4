package com.stackroute.javape4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfNameInString {
    boolean presenceOfNameInString(String input)
    {   //Check if the input is null
        if(input==null)
        {
            return false;
        }
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("Harry");

        // Search above pattern in the input string
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
