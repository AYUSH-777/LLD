package org.example;

public abstract class PlayingPiece {
    private PlayingPieceType playingPieceType;

    public PlayingPiece(PlayingPieceType playingPieceType) {
        this.playingPieceType = playingPieceType;
    }

    public PlayingPieceType getPlayingPieceType() {
        return playingPieceType;
    }

    public void setPlayingPieceType(PlayingPieceType playingPieceType) {
        this.playingPieceType = playingPieceType;
    }
}
