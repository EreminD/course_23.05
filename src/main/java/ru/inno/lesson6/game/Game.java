package ru.inno.lesson6.game;

public class Game {

    public static void main(String[] args) {
        Hero knight = new Knight();
        Hero wizard = new Wizard();
        Enemy enemy = new Troll();

        knight.attack(enemy);
        wizard.attack(enemy);
        wizard.attack(enemy);
        wizard.attack(enemy);

        System.out.println(enemy.isAlive());
        wizard.attack(enemy);
        System.out.println(enemy.isAlive());
    }
}
