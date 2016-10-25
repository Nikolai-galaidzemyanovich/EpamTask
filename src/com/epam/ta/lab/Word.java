package com.epam.ta.lab;


public class Word {
    private String word;

    public Word(String str){
        word = str;
    }

    public void replaceCharacter(int k, char c){

        if (k >= 0 &&  k < word.length()){
            StringBuilder builder = new StringBuilder(word);
            builder.setCharAt(k, c);
            word = builder.toString();
        }
    }
    @Override
    public String toString() {
        return word;
    }
}
