package org.example;

import java.util.Random;

public class AITurn {

    private int positionIndex;

    private int row;

    private int column;

    private char piece = 'o';

//    public int setPositionIndex() {
//        Random r = new Random();
//        int positionIndex = r.nextInt(9);
//        this.positionIndex = new Random().ints(1,1,10).findFirst().getAsInt();
//        this.positionIndex = positionIndex + 1;
//        return this.positionIndex;
//    }

    public void setRow() {
//        int positionIndex = setPositionIndex();
        Random r = new Random();
        positionIndex = r.nextInt(1,10);
        if (positionIndex<=3) {
            this.row = 1;
        } else if (positionIndex<=6) {
            this.row = 2;
        } else {
            this.row = 3;
        }
        this.row = row;
    }

    public void setColumn() {
//        int positionIndex = setPositionIndex();
        Random r = new Random();
        positionIndex = r.nextInt(1,10);
        column = positionIndex%3;
        if (column==0) {
            column = 3;
        }
        this.column = column;
    }

    public void setPiece(char noughtOrCross) {
        this.piece = piece;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public char getPiece() {
        return this.piece;
    }

    public int getPositionIndex() {
        return this.positionIndex;
    }

}
