package ru.inno.lesson12.enums;

import java.util.Objects;

public class GenreClass {
    public static final GenreClass ACTION = new GenreClass("Приключения", 7);
    public static final GenreClass SCI_FI = new GenreClass("Фантастика", 42);
    public static final GenreClass COMEDY = new GenreClass("Комедия", 101);

    private String name;
    private int code;

    private GenreClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode(){
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenreClass that)) return false;
        return getCode() == that.getCode() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCode());
    }

    @Override
    public String toString() {
        return "GenreClass{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
