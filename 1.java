*В каждом слове текста k-ю букву заменить заданным символом. Если k
больше длины слова, корректировку не выполнять.


package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] text = ("Каждая его капля выбивает в воде круглое углубление,маленькую водяную чашу, подскакивает," +
                "снова падает и несколько мгновений, прежде чем исчезнуть, еще видна на дне этой водяной " +
                "чаши.").split(" ");
        char symbol = '@';
        int k = 3;
        char[] newText;
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= k) {
                newText = text[i].toCharArray();
                newText[k - 1] = symbol;
                text[i] = String.copyValueOf(newText);
            }
        }
        for (int i = 0; i <= text.length; i++) {
        }
        System.out.println(Arrays.toString(text));
    }
}
