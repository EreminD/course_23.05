package ru.inno.lesson4;

public class LoopIntro {

    public static void main(String[] args) {

        int x = 5;
        x = x + 1;
        System.out.println(x);

        System.out.println("Старт");

        for (int counter = 0; counter < Integer.MAX_VALUE; counter = counter + 1) {
            System.out.println("counter = " + counter);
            System.out.println("Привет мир" + counter);
        }

        System.out.println("Финиш");
    }
}
