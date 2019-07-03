package com.stackroute.javape4;

 class ReplaceTheCharacter {

    String replaceTheCharacter(String original){
        //checking if the input string is null
        if(original==null)
        {
            return "This is invalid";
        }
        String result="";
        String modified_output="";
        result=original.replace('d','f');//replacing the first character
        modified_output=result.replace('l','t');//replacing the second character after replacing the first one
        return modified_output;

    }

}
