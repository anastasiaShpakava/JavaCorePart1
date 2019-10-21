*После каждого слова текста, заканчивающегося заданной подстрокой,
вставить указанное слово.




package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String symbol = "и";
        int position = 2;
        String newText = text.replace(symbol, "");
        System.out.println("Text without symbol: " + newText);
        String[] str = newText.split(" ");
        for (int i = 0; i < str.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(str[i]);
            stringBuffer.insert(position, symbol);
            System.out.println("New text:" + stringBuffer);
        }
    }
}
