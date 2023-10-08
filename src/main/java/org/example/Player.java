package org.example;

public class Player {
    private String name;
    private int health;

    public Player() {
        this.name = "";
        this.health = 100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }
}

