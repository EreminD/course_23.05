package ru.inno.lesson11.inheritance;

import ru.inno.lesson11.AuthService;

import java.util.ArrayList;
import java.util.List;

public class vk {

    public static void main(String[] args) {
        Fruit f = new Fruit();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();


        Admin admin1 = new Admin();
        Admin admin2 = new Admin();

        SuperAdmin superAdmin = new SuperAdmin();
        superAdmin.name = "Паша";

        superAdmin.sayName();

        Support support = new Support();

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(admin2);
        users.add(admin1);
        users.add(superAdmin);
        users.add(support);

        List<Admin> admins = new ArrayList<>();
        admins.add(admin1);
        admins.add(admin2);
        admins.add(superAdmin);


        /// online users
        User u = new Admin();
        User sa = new SuperAdmin();

        AuthService authService = new AuthService();
        authService.auth(new User());
        authService.auth(new SuperAdmin());
        authService.auth(new Admin());
        authService.auth(new Support());


    }


}
