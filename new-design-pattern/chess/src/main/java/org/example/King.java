package org.example;

import static java.lang.Math.abs;

public class King extends Piece{

    public King(boolean isWhite, boolean isKilled) {
        super(isWhite, isKilled);
    }

    @Override
    public boolean isValidMove(Spot start, Spot end) {
        if(end.getPiece().isWhite()==start.getPiece().isWhite())
        {
            return false;
        }
        int x1 = start.getX();
        int y1 = start.getY();
        int x2 = end.getX();
        int y2 = end.getY();

        int x = abs(x1-x2);
        int y = abs(y1-y2);

        return x < 2 && y < 2 && x + y > 0;
    }

}
