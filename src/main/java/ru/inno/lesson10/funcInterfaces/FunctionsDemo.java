package ru.inno.lesson10.funcInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionsDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Галина", "Данила", "Никита", "Анна", "Милана");

        Function<String, String> upperCase = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        Function<String, String> lowerCase = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };

        Function<String, String> countSymbols = s -> String.valueOf(s.length());


        List<String> mapped = map(names, countSymbols);
    }

    public static List<String> map(List<String> allNames, Function<String, String> rule){
        List<String> result = new ArrayList<>();

        for (String name : allNames) {
            String res = rule.apply(name);
            result.add(res);
        }

        return result;
    }
}
