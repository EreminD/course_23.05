package ru.inno.lesson6;

public class Card {
    private String number;
    private String pinCode;

    public Card(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public void getNumber() {
        System.out.println(" **** **** **** " + number.substring(number.length() - 4));
    }

    public void getNumber(String pinCode) {
        if (pinCode.equals(this.pinCode)) {
            System.out.println(this.number);
        } else {
            this.getNumber();
        }
    }
}
