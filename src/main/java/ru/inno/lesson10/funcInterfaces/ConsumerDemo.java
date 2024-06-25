package ru.inno.lesson10.funcInterfaces;

import java.util.List;

public class ConsumerDemo {

    public static void main(String[] args) {

        List<String> names = List.of("Галина", "Данила", "Никита", "Анна", "Милана");

        names.forEach(n -> {
            System.out.println(n);
            System.out.println("xxxxxxxxx");
        });

        for (String name : names) {
            System.out.println(name);
            System.out.println("xxxxxxxxx");
        }

        // Functional interface
        java.util.function.Consumer<String> consumer1 = new java.util.function.Consumer<String>() { // что делать со значением, когда попросят
            public void accept(String s) {
                System.out.println("<====");
                System.out.println(s);
                System.out.println("====>");
            }
        };

        java.util.function.Consumer<String> consumer2 = new java.util.function.Consumer<String>() { // что делать со значением, когда попросят
            public void accept(String s) {
                System.out.print("[");
                System.out.print(s);
                System.out.println("]");
            }
        };

        // что делать со значением, когда попросят
        java.util.function.Consumer<String> consumer3 = s1 -> {
            System.out.println(" ");
            System.out.println(s1);
            System.out.println("------");
        };

        // аргумент -> {тело функции}


        for (String name : names) {
            printName(name, consumer3);
        }
    }

    public static void printName(String name, java.util.function.Consumer<String> action) {
        action.accept(name);
    }
}
