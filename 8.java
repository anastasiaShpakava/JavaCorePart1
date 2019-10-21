*Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
последовательностями подряд идущих букв оставить хотя бы один пробел.



package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] newText = text.split("[^a-zA-Z]+");
        String str = "";
        for (int i = 0; i < newText.length; i++) {
            str = str + newText[i] + " ";
        }
        System.out.println("Text without symbols: " + str);
    }
}
