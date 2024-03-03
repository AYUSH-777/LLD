package org.example;

public class ChessBoard {
    private int size;
    private Spot[][] board;

    public ChessBoard(int size)
    {
        this.size = size;
        this.board = new Spot[size][size];
    }

    public Spot getSpot(int x,int y)
    {
        return board[x][y];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Spot[][] getBoard() {
        return board;
    }

    public void setBoard(Spot[][] board) {
        this.board = board;
    }
}
