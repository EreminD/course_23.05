package ru.inno.lesson11.inheritance;

public class User {
    protected int id;
    protected String name;

    public void auth(String login, String pass){
        System.out.println("Логиним пользователя!!!");
        System.out.println("Введите логин/пароль");
    }

    protected void sayName() {
        System.out.println("My name is " + name);
    }
}
