package ru.skillbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogWithoutAnnotation {

    private static final Logger logger = LoggerFactory.getLogger(LogWithoutAnnotation.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        logger.info("hi!");
    }
}
