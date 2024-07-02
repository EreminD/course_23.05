package ru.inno.lesson12.enums;

import java.util.Objects;

public class RatingClass {

    public static final RatingClass R_1 = new RatingClass(1);
    public static final RatingClass R_2 = new RatingClass(2);
    public static final RatingClass R_3 = new RatingClass(3);
    public static final RatingClass R_4 = new RatingClass(4);
    public static final RatingClass R_5 = new RatingClass(5);

    private int rating;

    private RatingClass(int rating) {
        this.rating = rating;
    }

    public int getValue() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RatingClass that)) return false;
        return getValue() == that.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "RatingClass{" +
                "rating=" + rating +
                '}';
    }
}
