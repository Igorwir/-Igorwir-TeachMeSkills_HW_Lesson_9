package com.teachmeskills.lesson_9.lesson_9_1.lesson_9_2.lesson_9_2_5;

/**
 *  Дана произвольная строка.
 *  Вывести на консоль новую строку, которой задублированно каждая буква из начальной строки.
 */
public class Dubl {
    public static void main(String[] args) {
        String samSt = "Bay";                 //Решение только не для дублтрующихся символов типо 'll' в  "Hello"
       char[] ch = samSt.toCharArray();
        for (int i = 0;i < ch.length;i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.print(ch[i]);
                     System.out.print(ch[j]);
                }
            }
        }
        String samSt2 = " Hello";                 //Нормальное решение
        StringBuilder sb = new StringBuilder();
        for (char c : samSt2.toCharArray()) {
            sb.append(c);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
        }


