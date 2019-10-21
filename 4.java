*В тексте слова заданной длины заменить указанной подстрокой, длина которой может не совпадать с длиной слова.



package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] text = str.split(" ");
        System.out.println("Enter word");
        Scanner scanner1 = new Scanner(System.in);
        String word = scanner.nextLine(); //слово, на которое заменяем
        int k = 3;                          // длина слова
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() == k) {
                text[i] = text[i].replaceAll(text[i], word);
            }
        }
        System.out.println(Arrays.toString(text));
    }
}
