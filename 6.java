*После каждого слова текста, заканчивающегося заданной подстрокой,
вставить указанное слово.



package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner scan = new Scanner(System.in);
        StringBuffer text = new StringBuffer(scan.nextLine());
        String word = "Check";
        int i = 0, pos1 = 0;
        while ((pos1 = text.indexOf("ый", i)) != -1) {
            pos1 += 3;
            text.insert(pos1, word);
            i = pos1;
        }
        System.out.println(text);
    }
}
