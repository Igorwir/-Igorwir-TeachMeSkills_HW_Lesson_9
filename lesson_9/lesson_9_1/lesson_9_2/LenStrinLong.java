package com.teachmeskills.lesson_9.lesson_9_1.lesson_9_2;

/**
 *   Найти самое длинное слово в строке и вывести его на экран.
 */
public class LenStrinLong {
    public static void main(String[] args) {
        String word = "Дана строка произвольной длины с произвольными словами";
        String[] chAr = word.split(" ");
        String ch1 = chAr[4];
        for (int i = 1; i < chAr.length; i++) {
            if (ch1.length() < chAr[i].length())
                ch1 = chAr[i];
        }
        System.out.println(ch1);
        System.out.println(ch1.length());


    }
}

