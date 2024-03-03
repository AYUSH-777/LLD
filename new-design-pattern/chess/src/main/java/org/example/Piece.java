package org.example;

public abstract class Piece {

    private boolean isWhite;
    private boolean isKilled;

    public Piece(boolean isWhite, boolean isKilled) {
        this.isWhite = isWhite;
        this.isKilled = isKilled;
    }

    public abstract boolean isValidMove(Spot start, Spot end);

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }
}
