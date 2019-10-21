* В тексте после k-го символа вставить заданную подстроку.



package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k = 2;
        String word = "CHECK";
        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] text = str.split(" ");
        for (int i = 0; i < text.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(text[i]);
            stringBuffer.insert(k, word);
            System.out.println(stringBuffer);
        }
    }
}
