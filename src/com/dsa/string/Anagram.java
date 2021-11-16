package com.dsa.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] a){
        String s1 = "abc",s2="bac",s3="xyz",s4="def";

        System.out.println(validateAnagram(s4,s2)?"Its a Anagram":"Its not an anagram");
        System.out.println(validateAnagram(s4,s3)?"Its a Anagram":"Its not an anagram");

    }

    public static boolean validateAnagram(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        if(Arrays.equals(one,two)){
            return true;
        }
        return false;
    }
}
