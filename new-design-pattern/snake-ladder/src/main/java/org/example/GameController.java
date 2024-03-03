package org.example;

public class GameController {
    private Board board;
    private Player player1;
    private Player player2;
    private Dice dice;
    private Player currentPlayer;

    public GameController(Board board, Player player1, Player player2, Dice dice, Player currentPlayer) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice;
        this.currentPlayer = currentPlayer;
    }

    public void addAgent(int x,int y,Agent agent)
    {
        Cell cell = board.getCell(x,y);
        cell.setAgent(agent);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
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

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
