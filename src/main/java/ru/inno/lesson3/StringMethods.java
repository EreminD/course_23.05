package ru.inno.lesson3;

public class StringMethods {

    public static void main(String[] args) {
        String name = ""+"Галина";


        // приводит содержимое строки к верхнему регистру
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();

        boolean empty = "".isEmpty();
        boolean blank = "      ".isBlank();



        System.out.println("upperCaseName = " + upperCaseName);
        System.out.println("lowerCaseName = " + lowerCaseName);
        System.out.println("name = " + name);

        System.out.println("empty = " + empty);
        System.out.println("blank = " + blank);

        String letters1 = "DEF";
        String letters2 = "ABC";
        System.out.println( letters1 + letters2 );

        System.out.println("class boolean String");

        String url = "https://vk.com";
        boolean startWithS = url.startsWith("https://");

        startWithS=url.startsWith("https://");

        System.out.println("connections is secure = " + startWithS);


        System.out.println( "Ресторан \"Вкусно и точка\"" );

        System.out.println( "\\\\\\\\\\\\\\" );
        System.out.println( "///////" );


        //https://vk.com
        String protocol = url.substring(0, 5);
        System.out.println(protocol);

        System.out.println(protocol.equals("https"));

        // StringIndexOutOfBoundsException
        int i = 0;

        String passportSerial = "0119 012567";

        String phoneNumber = "F TR JDS HSDLJH";

        String number = "+79462340897";

        System.out.println(passportSerial);



    }

}
