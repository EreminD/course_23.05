package ru.inno.lesson12.enums;

public class Kinopoisk {

    public static void main(String[] args) {

        Movie m1 = new Movie("Довод", Genre.ACTION);
        Movie m11 = new Movie("Индиана Джонс", Genre.COMEDY);
        Movie m2 = new Movie("Интерстеллар", Genre.SCI_FI);
        Movie m3 = new Movie("Марсианин", Genre.ROMANCE);

        System.out.println(Genre.ROMANCE.getCode());
        System.out.println(Genre.ROMANCE.getRusName());

        go(Sides.NORTH);

    }

    public static void go(Sides side){

    }
}
