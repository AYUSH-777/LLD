package org.example;

public class Board {
    private int size;
    private PlayingPiece[][] board;
    public Board(int size)
    {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(PlayingPiece[][] board) {
        this.board = board;
    }

    public boolean playMove(int row,int col,PlayingPiece playingPiece)
    {
        if(board[row][col]!=null)
        {
            return false;
        }
        board[row][col]=playingPiece;
        return true;
    }

    public boolean checkWin(Player player)
    {
        for(int i=0;i<size;i++)
        {
            boolean isWin = true;
            for(int j=0;j<size;j++)
            {
                if(board[i][j]!=player.getPlayingPiece())
                {
                    isWin = false;
                    break;
                }
            }
            if(isWin)
            {
                return true;
            }
        }

        for(int j=0;j<size;j++)
        {
            boolean isWin = true;
            for(int i=0;i<size;i++)
            {
                if(board[i][j]!=player.getPlayingPiece())
                {
                    isWin = false;
                    break;
                }
            }
            if(isWin)
            {
                return true;
            }
        }
        boolean isWin = true;
        for(int i=0;i<size;i++)
        {
            if(board[i][i]!=player.getPlayingPiece())
            {
                isWin = false;
                break;
            }
        }
        if(isWin)
        {
            return true;
        }
        isWin = true;
        for(int i=0;i<size;i++)
        {
            if(board[i][size-i-1]!=player.getPlayingPiece())
            {
                isWin = false;
                break;
            }
        }
        if(isWin)
        {
            return true;
        }
        return false;
    }

    public void display()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(board[i][j].getPlayingPieceType()+" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
