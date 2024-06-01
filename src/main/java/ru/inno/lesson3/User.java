package ru.inno.lesson3;

public class User {
    String name;
    int age;
    String phone;
    String email;
    double rating;
    boolean isOnline;

    public User(String myName, int myAge, boolean status, String myPhone, String myEmail){
        age  = myAge;
        name = myName;
        phone = myPhone;
        email = myEmail;
        isOnline = status;
        rating = 5.0;
    }
    
}
