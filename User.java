package com.caresoft.clinicapp;

public class User {
	//Attributes
    protected Integer id;
    protected int pin;


    //constructors
    public User(Integer id) {
        super();
        this.id = id;

    }

    //getters and setters for id

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
}
