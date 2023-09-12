package org.apache.coyote.http11.request;

import java.util.Arrays;
import org.apache.coyote.http11.exception.NoSuchApiException;

public enum HttpMethod {

    GET("GET"),
    POST("POST"),
    PATCH("PATCH"),
    PUT("PUT"),
    DELETE("DELETE");
    private final String method;

    HttpMethod(String method) {
        this.method = method;
    }

    public static HttpMethod mapping(String method) {
        return Arrays.stream(values())
                .filter(value -> value.method.equals(method))
                .findFirst()
                .orElseThrow(NoSuchApiException::new);
    }

    @Override
    public String toString() {
        return method;
    }
}
