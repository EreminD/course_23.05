package ru.inno.lesson12.generics;

import ru.inno.lesson11.inheritance.User;
import ru.inno.lesson9.BookC;

public class Playground {

    public static void main(String[] args) {

        HttpResponseString response = getInfo();
        String body = response.getData();

        // bad
        String data = new HttpResponseString(200, "").getData();
        BookC data1 = new HttpResponseBook(200, "").getData();
        User data2 = new HttpResponseUser(200, "").getData();

        // good
        BookC body1 = new HttpResponse<BookC>(200, "").getBody();
        User body2 = new HttpResponse<User>(200, "").getBody();
    }

    private static HttpResponseString getInfo() {
        return new HttpResponseString(200, "Hello world");
    }
}

