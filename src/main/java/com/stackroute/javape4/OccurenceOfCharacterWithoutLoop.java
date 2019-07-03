package com.stackroute.javape4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceOfCharacterWithoutLoop {

    public int occurenceOfCharacterWithoutLoop(String input,char ch)
    {
        int counter=0;
        int original_length=input.length();//finding the length of input

        int result_length=input.replaceAll(Character.toString(ch),"").length();

        counter=original_length-result_length;//finding the number of occurence
        return counter;//returning the count of occurence
    }
}
