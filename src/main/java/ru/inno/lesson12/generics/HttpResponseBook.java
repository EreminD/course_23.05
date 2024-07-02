package ru.inno.lesson12.generics;

import ru.inno.lesson9.BookC;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HttpResponseBook {

    private int statusCode;
    private Map<String, String> headers;
    private BookC data;

    public HttpResponseBook(int statusCode, String data) {
        this.statusCode = statusCode;
        this.headers = new HashMap<>();
        this.data = new BookC();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public BookC getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HttpResponseBook that)) return false;
        return getStatusCode() == that.getStatusCode() && Objects.equals(getHeaders(), that.getHeaders()) && Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatusCode(), getHeaders(), getData());
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "statusCode=" + statusCode +
                ", headers=" + headers +
                ", body='" + data + '\'' +
                '}';
    }
}
