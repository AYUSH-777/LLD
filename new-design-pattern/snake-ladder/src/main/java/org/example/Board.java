package org.example;

public class Board {
    private int size ;
    private Cell[][] board;

    public Board(int size)
    {
        this.size = size;
        this.board = new Cell[size][size];
    }

    public Cell getCell(int x,int y)
    {
        return board[x][y];
    }

    public void setCell(int x,int y, Cell cell)
    {
        board[x][y]=cell;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }
}
