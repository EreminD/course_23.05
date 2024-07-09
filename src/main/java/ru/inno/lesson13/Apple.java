package ru.inno.lesson13;

public class Apple extends Fruit{

    public Apple(){
        super.name = "яблоко";
        super.color = "красное";
    }

    @Override
    public int getPrice() {
        return 300; //
    }
}
