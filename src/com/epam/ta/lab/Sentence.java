package com.epam.ta.lab;


import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private  List<Word>  words = new ArrayList<>();

    public Sentence(String str){
        String[] wordStrs = str.split(" ");
        for(String wordStr: wordStrs) {
            Word word = new Word(wordStr);
            words.add(word);
        }
    }

    public List<Word> getWords() {
        return words;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word s: words) {
            sb.append(s.toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}
