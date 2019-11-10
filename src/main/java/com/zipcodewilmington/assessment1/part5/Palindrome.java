package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.Arrays;

public class Palindrome extends BasicStringUtils {

    public Integer countPalindromes(String input) {

        int count = 0;                                                                    //to count all palindromes
        String checkString;
        for (int segmentLength = 1; segmentLength <= input.length(); segmentLength++){    //loops through different length segments
            for (int i = 0; i <= input.length()-segmentLength; i++){                      //loops through all segments of a given length defined by the above loop
                checkString = input.substring(i,i + segmentLength);                       //strictly unnecessary, but makes the if statement more human readable
                if(checkString.equals(reverse(checkString))){count++;}                    //if segment matches the reverse segment, increase the count by one
            }
        }
        return count;
    }

}