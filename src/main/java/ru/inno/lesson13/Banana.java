package ru.inno.lesson13;

public class Banana extends Fruit {

    public Banana() {
        super.name = "банан";
        super.color = "желтый";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
