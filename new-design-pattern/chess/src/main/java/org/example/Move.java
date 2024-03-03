package org.example;

public class Move {
    private Spot start;
    private Spot end;
    private Player player;
    private Piece sourcePiece;
    private Piece endPiece;

    public Move(Spot start, Spot end, Player player, Piece sourcePiece, Piece endPiece) {
        this.start = start;
        this.end = end;
        this.player = player;
        this.sourcePiece = sourcePiece;
        this.endPiece = endPiece;
    }

    public Spot getStart() {
        return start;
    }

    public void setStart(Spot start) {
        this.start = start;
    }

    public Spot getEnd() {
        return end;
    }

    public void setEnd(Spot end) {
        this.end = end;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Piece getSourcePiece() {
        return sourcePiece;
    }

    public void setSourcePiece(Piece sourcePiece) {
        this.sourcePiece = sourcePiece;
    }

    public Piece getEndPiece() {
        return endPiece;
    }

    public void setEndPiece(Piece endPiece) {
        this.endPiece = endPiece;
    }
}
