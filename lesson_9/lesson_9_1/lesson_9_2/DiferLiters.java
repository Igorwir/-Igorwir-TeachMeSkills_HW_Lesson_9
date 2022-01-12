package com.teachmeskills.lesson_9.lesson_9_1.lesson_9_2;

/**
 * Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class DiferLiters {
    public static void main(String[] args) {
        Character ch;
        String text = "fffff ab f 1234 jkjk";
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {            // Задание выполнено неполностью
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j] + " ");

                }
            }
        }
    }
}




