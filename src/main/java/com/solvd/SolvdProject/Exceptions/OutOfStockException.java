package com.solvd.SolvdProject.Exceptions;

public class OutOfStockException extends Exception {
    private static final long SerialVersionUID = 2L;

    public OutOfStockException () {
        super("Out Of Stock Exception!");
    }

    public OutOfStockException(String msg) {
        super(msg);
    }
}
