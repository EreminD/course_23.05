package ru.inno.lesson2;

public class Strings {

    public static void main(String[] args) {
        String name = "Дима любит";
        String empty = "";
        String blank = " ";
        String inn = "123453212345";
        String trueValue = "true";

        String longTerm = "very long text https://whiletrue.neocities.org/lte";
        System.out.println(empty);

        System.out.println( name + " шоколад"  );
        System.out.println( name.length() );
        System.out.println( empty.length() );
        System.out.println( blank.length() );
        System.out.println( inn.length() );
        System.out.println( longTerm.length() );

        System.out.println(name.toUpperCase());
        System.out.println(name.equals(""));

    }
}
