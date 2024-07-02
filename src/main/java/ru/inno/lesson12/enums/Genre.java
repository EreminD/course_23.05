package ru.inno.lesson12.enums;

public enum Genre {
    SCI_FI("Фантастика", 42),
    COMEDY("Комедия", 101),
    ACTION("Приключения", 7),
    ROMANCE("Мелодрама", 2 );

    private String rusName;
    private int code;

    Genre(String rusName, int code) {
        this.rusName = rusName;
        this.code = code;
    }

    public String getRusName() {
        return rusName;
    }

    public int getCode() {
        return code;
    }
}
