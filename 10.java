*Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками «(» и «)» или между звездочками «*» и т. п.)


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String newText = text.replaceAll("[*].*[*]", "");
        System.out.println(newText);
    }
}
