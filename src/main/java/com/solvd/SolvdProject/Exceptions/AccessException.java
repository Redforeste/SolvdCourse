package com.solvd.SolvdProject.Exceptions;

public class AccessException extends Exception {
    private static final long SerialVersionUID = 3L;

    public AccessException () {
        super("Access Deny!");
    }

    public AccessException(String msg) {
        super(msg);
    }
}
