package ru.skillbox;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogWithLombokAnnotation {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.info("hi!");
    }
}
