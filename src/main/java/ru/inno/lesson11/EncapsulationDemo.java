package ru.inno.lesson11;

import java.time.LocalDateTime;

public class EncapsulationDemo {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        Lesson lesson = new Lesson(now, "Topic1", "D.E.");


    }

}
