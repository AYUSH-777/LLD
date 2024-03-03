package org.example;

import java.io.FileReader;

public class TicTacToe {
    private Board board;
    private Player firstPlyer;
    private Player secondPlayer;
    private int totalCnt ;

    public TicTacToe(Board board, Player firstPlyer,Player secondPlayer)
    {
        this.board = board;
        this.firstPlyer = firstPlyer;
        this.secondPlayer = secondPlayer;
        totalCnt = 0;
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getFirstPlyer() {
        return firstPlyer;
    }

    public void setFirstPlyer(Player firstPlyer) {
        this.firstPlyer = firstPlyer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public void makeMove(int row,int col,Player player)
    {
        boolean move = false;
        int size = board.getSize();
        if(totalCnt<(size*size))
        {
            move = board.playMove(row,col, player.getPlayingPiece());
            if(move)
            {
                totalCnt++;
            }
            disp();
            if(checkIfPlayerWins(player))
            {
                System.out.println(player.getName()+" won the game");
                return ;
            }
        }
        if(totalCnt>=size*size)
        {
            System.out.println("Game Drawn");
            disp();
            return;
        }
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    public boolean checkIfPlayerWins(Player player)
    {
        return board.checkWin(player);
    }

    public void disp()
    {
        board.display();
    }
}
