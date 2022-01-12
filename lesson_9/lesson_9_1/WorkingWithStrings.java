package com.teachmeskills.lesson_9.lesson_9_1;

public class WorkingWithStrings {
    String y;

    public WorkingWithStrings(String y) {
        this.y = y;
    }

    public static void main(String[] args) {
        WorkingWithStrings str = new WorkingWithStrings("5555-yZa-3728-klf-8y7y");
        Metods.twoString(str);
        Metods.change(str);
        Metods.lowCase(str);
       // Metods.upCase(str);
        Metods.start(str);
        Metods.nums(str);
        Metods.end(str);
    }
}
