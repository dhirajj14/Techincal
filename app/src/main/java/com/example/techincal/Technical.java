package com.example.techincal;

public class Technical {
    char[] letters = {'A','B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    String printMarket(String word){
        String letNum = "";
        char[] letChar = word.toCharArray();
        for(int i = 0; i<word.length();i++){
            for(int j = 0 ; j<26;j++){
                if(letChar[i] == letters[j]){
                    letNum += String.valueOf(j) + " ";
                }
            }
        }
        return letNum;
    }


    }
