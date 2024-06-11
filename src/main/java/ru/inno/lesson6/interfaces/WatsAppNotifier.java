package ru.inno.lesson6.interfaces;

import ru.inno.lesson6.User;

public class WatsAppNotifier implements Notifier {

    public void notifyUser(User user, String txt) {
        System.out.println("Уведомляем по WA: " + txt );
    }
}

