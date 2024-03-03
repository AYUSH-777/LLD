package org.example;

public class Player {
    private String name;
    private int curPosition;

    public Player(String name, int curPosition) {
        this.name = name;
        this.curPosition = curPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurPosition() {
        return curPosition;
    }

    public void setCurPosition(int curPosition) {
        this.curPosition = curPosition;
    }
}
