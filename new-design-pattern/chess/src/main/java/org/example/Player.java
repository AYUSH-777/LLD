package org.example;

public class Player {
    private String playerName;
    private boolean isWhite;

    public Player(String playerName, boolean isWhite) {
        this.playerName = playerName;
        this.isWhite = isWhite;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }
}
