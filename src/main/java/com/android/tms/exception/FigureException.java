package com.android.tms.exception;

import org.apache.log4j.Logger;

public class FigureException extends Exception {

    String className;

    public FigureException(String message, String className) {
        super(message);
        this.className = className;
        Logger log = Logger.getLogger(className);
        log.error("Invalid input data");
    }
}
