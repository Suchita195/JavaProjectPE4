package com.stackroute.javape4;

public class TransposeOfString {
    String transposeOfString(String original)
    {   //checking if the string entered is null
        if(original==null)
        {
            return "This is invalid";
        }
        String words[]=original.split(" ");//splitting the words on space
        String reverseWord="";
        //for each string word in array words
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return "Input String :" +original+ "\n"+"Output String:" +reverseWord.trim();
    }
}
