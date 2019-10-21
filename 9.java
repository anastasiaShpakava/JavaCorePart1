*Из текста удалить все слова заданной длины, начинающиеся на согласную букву.



package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] newText = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < newText.length; i++) {
            char firstLetter = newText[i].charAt(0);
            if ((newText[i].length() != 5) && ((firstLetter != 'а') && (firstLetter != 'е') && (firstLetter != 'ё') && (firstLetter != 'и') && (firstLetter != 'о')
                    && (firstLetter != 'у') && (firstLetter != 'э') && (firstLetter != 'ю') && (firstLetter != 'я'))) {
                stringBuilder.append(newText[i] + " ");
            }
        }
        String ourText = stringBuilder.toString();
        System.out.println("New text: " + ourText);
    }
}
