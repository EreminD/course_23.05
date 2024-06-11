package ru.inno.lesson6.interfaces;

import ru.inno.lesson6.User;

public class PushNotifier implements Notifier {
    public void notifyUser(User user, String txt) {
        System.out.println("Отправляем PUSH на устройство пользователю " + user.getName() + " : " + txt);
    }

}
