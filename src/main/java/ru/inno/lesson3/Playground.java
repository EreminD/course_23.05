package ru.inno.lesson3;

public class Playground {

    public static void main(String[] args) {

        int count = 1;
        int divider = 10;
        String city = "Moscow";

        User user1 = new User("Alex", 27, true, "88005553535", "user1@mail.ru");

        User user2 = new User("Mike", 48, false, "88005553535", "user2@mail.ru");


        System.out.println(user2.name + user2.age + " " + user2.rating);
        System.out.println(user1.name + user1.age+ " " + user1.rating);

        Smartphone iphone15 = new Smartphone();
        System.out.println(iphone15.hddGb);

        Smartphone iphone6 = new Smartphone();
        iphone6.hddGb = 16;
        System.out.println(iphone6.hddGb);

        Car car1 = new Car();
        car1.brand = "Mazda";
        car1.model = "mx-5";
        car1.color = "red";
        car1.price = 123456;
        car1.engineV = 1.5;
        car1.year = 2000;



    }
}
