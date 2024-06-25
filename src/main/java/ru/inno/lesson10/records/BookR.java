package ru.inno.lesson10.records;

public record BookR(String title, int year, String author) {

    public String getFullInfo(){
        return String.format("%s: %s (%d)", this.author, this.title, this.year);
    }
}
