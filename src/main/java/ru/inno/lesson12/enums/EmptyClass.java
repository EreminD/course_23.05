package ru.inno.lesson12.enums;

public class EmptyClass {
    public static final EmptyClass E1 = new EmptyClass("", 1);
    public static final EmptyClass E2 = new EmptyClass("", 2);
    public static final EmptyClass E3 = new EmptyClass("", 3);


    private String name;
    private int code;

    private EmptyClass(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
