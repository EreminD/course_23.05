package ru.inno.lesson11.inheritance;

public class SuperAdmin extends Admin {

    @Override
    public void auth(String login, String pass) {
        super.auth("", "this.name");
        System.out.println("Введите смс с телефjна ***1234");
    }

}
