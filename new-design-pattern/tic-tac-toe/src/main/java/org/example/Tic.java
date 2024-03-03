package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tic {
    public static void main(String[] args) {
         Board board = new Board(3);
         Player p1 = new Player("Ayush",new PlayingPieceTypeO());
         Player p2 = new Player("Vidhi", new PlayingPieceTypeX());
         TicTacToe ticTacToe = new TicTacToe(board,p1,p2);
         ticTacToe.disp();
//         ticTacToe.makeMove(0,1,p1);
//         ticTacToe.makeMove(1,0, p2);
//        ticTacToe.makeMove(0,0, p1);
//        ticTacToe.makeMove(1,1, p2);
//        ticTacToe.makeMove(0,2,p1);
        ticTacToe.makeMove(1,1,p2);
        ticTacToe.makeMove(0,0,p2);
        ticTacToe.makeMove(0,2,p2);
        ticTacToe.makeMove(1,0,p1);
        ticTacToe.makeMove(2,2,p2);
        ticTacToe.makeMove(1,2,p1);
        ticTacToe.makeMove(2,1,p2);
        ticTacToe.makeMove(0,1,p1);
        ticTacToe.makeMove(2,0,p1);



    }
}