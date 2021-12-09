package com.solvd.SolvdProject.Exceptions;

public class OrderException extends Exception {
    private static final long SerialVersionUID = 1L;

    public OrderException () {
        super("Order Exception!");
    }

    public OrderException(String msg) {
        super(msg);
    }
}
