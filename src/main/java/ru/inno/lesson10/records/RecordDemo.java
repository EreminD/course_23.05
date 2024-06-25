package ru.inno.lesson10.records;

import ru.inno.lesson9.BookC;

public class RecordDemo {

    public static void main(String[] args) {
        BookR bookRecord1 = new BookR("Мы", 1923, "Е.Замятин");
        BookR bookRecord2 = new BookR("Мы", 1923, "Е.Замятин");
        BookC bookClass1 = new BookC("Мы", 1923, "Е.Замятин");
        BookC bookClass2 = new BookC("Мы", 1923, "Е.Замятин");

        System.out.println(bookRecord1.equals(bookRecord2));
        System.out.println(bookRecord1);

        System.out.println(bookRecord1.year());

        System.out.println(bookClass1.getFullInfo());
        System.out.println(bookRecord1.getFullInfo());

        bookClass1.setTitle("Вы");

        bookRecord1 = new BookR("Вы", bookRecord1.year(), bookRecord1.author());
    }
}
