package ru.inno.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Playground {

    public static void main(String[] args) {

        Fruit a = new Apple();
        Fruit b = new Banana();

        List<Fruit> cart = new ArrayList<>();
        cart.add(a);
        cart.add(b);

        cart.forEach(fr -> System.out.println(fr.getName()));
    }
}
