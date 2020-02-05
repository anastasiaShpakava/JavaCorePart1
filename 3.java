*В каждом слове текста k-ю букву заменить заданным символом. Если k
больше длины слова, корректировку не выполнять.


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines here:");
        int n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String[] text = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line №" + (i + 1));
            text[i] = new String(scanner1.nextLine());
        }
        for (int i = 0; i < n; i++) {
            text[i] = text[i].replace("ра", "ро");
            System.out.println(text[i]);
        }
    }
}
