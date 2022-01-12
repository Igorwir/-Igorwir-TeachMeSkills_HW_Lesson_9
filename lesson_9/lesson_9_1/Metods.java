package com.teachmeskills.lesson_9.lesson_9_1;

import java.util.Locale;

public class Metods {

    public static void twoString(WorkingWithStrings y) {
        String rel = y.y.substring(0, 5).replace("-", "");
        String rel2 = y.y.substring(8, 13);
        System.out.println(rel + "" + rel2);
    }

    public static void change(WorkingWithStrings y) {
        String ch = y.y.replace("yZa", "каждая буква заменятся на").replace("klf", "каждая буква заменятся на");
        System.out.println(ch);
    }

    public static void lowCase(WorkingWithStrings y) {
        String sl = y.y.replace('-', '/');
        String rez = sl.replaceAll("[^a-zA-Z/]", "").toLowerCase(Locale.ROOT);
        StringBuilder st = new StringBuilder(rez);
        st.deleteCharAt(0).deleteCharAt(4);
        System.out.println(st);
    }

   /* public static void upCase(WorkingWithStrings y) {
        String sl = y.y.replace('-', '/');
        StringBuilder str = new StringBuilder(sl);               <--    Не выполнено
        str.setCharAt(20, '/');
        System.out.println(str);*/



    public static void start(WorkingWithStrings y) {

        String chek = "abc";
        boolean isStart = y.y.startsWith(chek);
        if (isStart) {
            System.out.println("Есть совпадение.");
        } else System.out.println("Нет совпадения.");

    }
    public static void nums(WorkingWithStrings y){
        String chek = "555";
        boolean isStart = y.y.startsWith(chek);
        if (isStart) {
            System.out.println("Есть совпадение.");
        } else System.out.println("Нет совпадения.");
    }
    public static void end(WorkingWithStrings y){
        String chek = "1a2b";
        boolean isEnd = y.y.endsWith(chek);
        if (isEnd) {
            System.out.println("Есть совпадение.");
        } else System.out.println("Нет совпадения.");
    }
}
