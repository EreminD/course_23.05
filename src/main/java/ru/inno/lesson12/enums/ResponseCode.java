package ru.inno.lesson12.enums;

public enum ResponseCode {
    OK(200),
    ACCEPTED(201),
    NO_CONTENT(204),
    BAD_REQUEST(400);

    private int code;

    ResponseCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
