package ru.inno.lesson4;

import java.util.Date;

public class ArraysObjects {

    public static void main(String[] args) {

        Track[] playlist = new Track[2];

        playlist[0] = new Track(274, "Daft Punk", "Give Life Back to Music", 2013, new byte[10]);
        playlist[1] = new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]);


        System.out.println(playlist[0].author);
        System.out.println(playlist[1].author);


        Track[] myList = {
                new Track(274, "Daft Punk", "Give Life Back to Music", 2013, new byte[10]),
                new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
                new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
                new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
                new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200]),
                new Track(307, "Юрий Лоза", "Плот", 1988, new byte[200])
        };

        int[] myNums = {
                1,
                2,
                3,
                8,
                800,
                555
        };

        System.out.println( myList[1].title );
    }
}
