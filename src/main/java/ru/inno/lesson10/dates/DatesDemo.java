package ru.inno.lesson10.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatesDemo {

    //Подскажите, пожалуйста, как лучше вывести строку типа 24 июн. 2024 22:30 к минутам?
    //

    public static void main(String[] args) {
        System.out.print("Введите дату и время публикации: в формате день месяц год час:минут"); //печать сколько прошло времени.

        Scanner input = new Scanner(System.in);
        String inputD = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");
        LocalDateTime parse = LocalDateTime.parse(inputD, formatter);

    }
}
