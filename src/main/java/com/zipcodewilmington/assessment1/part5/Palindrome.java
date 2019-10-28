package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        String temp = input;
        for(int index = 0; index < input.length(); index++) {
            for(int size = 1; size < input.length() - index + 1; size++) {
                if(isPalindrome(input.substring(index, index + size))){
                    count++;
                }
            }
        }
        return count;
    }
}
