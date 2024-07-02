package ru.inno.lesson12.generics;

import java.util.Map;
import java.util.Objects;

public class HttpResponse<T> {
    private int code;
    private Map<String, String> headers;
    private T body;

    public HttpResponse(int code, String body) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public T getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HttpResponse<?> that)) return false;
        return getCode() == that.getCode() && Objects.equals(getHeaders(), that.getHeaders()) && Objects.equals(getBody(), that.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getHeaders(), getBody());
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "code=" + code +
                ", headers=" + headers +
                ", body=" + body +
                '}';
    }
}
