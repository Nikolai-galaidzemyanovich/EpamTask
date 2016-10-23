package com.epam.ta.lab;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTask {

    public static void main(String[] args) {
        System.out.println("Enter text ");
        Scanner scanner = new Scanner(System.in);
        String enteredText = scanner.nextLine();
        Sentence sentence = new Sentence(enteredText);

        int enteredNumber = 0;
        do {
            try {
                System.out.println("Enter k-th position");
                enteredNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                // skip incorrect value
                scanner.next();
            }
        } while (true);

        System.out.println("Enter symbol");
        char symbol = scanner.next().charAt(0);

        for (Word word: sentence.getWords()){
            word.replaceCharacter(enteredNumber -1, symbol);
        }
        System.out.println(sentence.toString());


    }
}
