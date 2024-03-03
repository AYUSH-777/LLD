package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chess {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private ChessBoard chessBoard;
    private List<Move> moveList;

    public Chess(Player player1, Player player2, Player currentPlayer, ChessBoard chessBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentPlayer;
        this.chessBoard = chessBoard;
        this.moveList = new ArrayList<>();
    }

    public Move giveMove(int x1,int y1, int x2,int y2,Player player,Piece movedPiece, Piece killedPiece)
    {
        Spot startSpot = chessBoard.getSpot(x1,y1);
        Spot endSpot = chessBoard.getSpot(x2,y2);
        return new Move(startSpot,endSpot,player,movedPiece,killedPiece);
    }

    public boolean makeMove(Move move)
    {
       Spot start = move.getStart();
       Spot end = move.getEnd();
       Piece sourcePiece = move.getSourcePiece();
       Piece endPiece = move.getEndPiece();

        if(!sourcePiece.isValidMove(start,end))
       {
           return false;
       }


       if(endPiece!=null)
       {
           endPiece.setKilled(true);
       }

       end.setPiece(endPiece);

       moveList.add(move);
       return true;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public void setMoveList(List<Move> moveList) {
        this.moveList = moveList;
    }
}
