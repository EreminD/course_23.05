package ru.inno.lesson7.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private int year;
    private List<Film> filmList;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
        this.filmList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void addFilm(Film film){
        this.filmList.add(film);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company company)) return false;
        return getYear() == company.getYear() && Objects.equals(getName(), company.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear());
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
