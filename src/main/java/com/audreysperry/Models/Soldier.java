package com.audreysperry.Models;

public abstract class Soldier {
    private String name;
    private String rank;
    private int serialNumber;

    public String sleep() {
        return "ZZZZ";
    }

    public String eat() {
        return "Yum";

    }

    public String walk(){
        return "Stomp";
    }

    public abstract String speak();
}
