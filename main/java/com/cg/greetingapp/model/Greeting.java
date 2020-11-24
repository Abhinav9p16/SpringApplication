package com.cg.greetingapp.model;

public class Greeting {
    private long counter;
    private String message;

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Greeting(long counter, String message) {
        this.counter = counter;
        this.message = message;
    }
}
