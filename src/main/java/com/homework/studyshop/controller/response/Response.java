package com.homework.studyshop.controller.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Response<T> {

    private final T data;
    private final Error error;

    public static <T> Response<T> ok(T data) {
        return new Response<>(data, null);
    }

    public static <T> Response<T> emptyOk() {
        return new Response<>(null, null);
    }

    public static <T> Response<T> error(Error error) {
        return new Response<>(null, error);
    }

    public static <T> Response<T> errorWith(String message) {
        return error(new Error(message));
    }
}
