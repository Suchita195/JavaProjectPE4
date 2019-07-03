package com.stackroute.javape4;

import java.util.Arrays;
import java.util.Comparator;

public class SortingOfWordsInParagraph {
    String sortingOfWordsInParagraph(String paragraph) {
        String[] words = paragraph.split(" ");
        Arrays.sort(words, (s1, s2) -> {
            if (s1.toLowerCase().equals(s2.toLowerCase()))      //comparing without ignoring case if words are same
                return s1.compareTo(s2);
            // ignoring case
            return s1.toLowerCase().compareTo(s2.toLowerCase());        //comparing by ignoring case if words are different
        });
        return String.join(" ",words);
    }
}