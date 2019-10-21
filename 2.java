*В каждом слове текста k-ю букву заменить заданным символом. Если k
больше длины слова, корректировку не выполнять.


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String number = "абвгдеёжзийклмнопрстуфхцчшщыъьэюя";
        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] newText = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(newText[i] + "  ");
        }
        System.out.println("");
        for (char x : newText) {
            if (x == ' ') {
                System.out.print(" ");
            } else {
                int i = number.lastIndexOf(x);
                i = i + 1;
                System.out.print(i + "  ");
            }
        }
    }
}
