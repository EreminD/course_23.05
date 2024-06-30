package ru.inno.lesson11;

import ru.inno.lesson11.inheritance.User;

public class AuthService {

    public boolean auth(User u){
        u.auth("u.name", "u.id");

        return true;
    }
}
