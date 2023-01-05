package org.example;

import java.util.Random;

public class AIBackend {

    private final RandomNumber r = new RandomNumber();
    private final int positionIndex = r.getPositionIndex();
    private int row;
    private int column;
//    public AIBackend(int positionIndex) {
//        this.positionIndex = positionIndex;
//    }

    public void setRow() {
//        RandomNumber r = new RandomNumber();
//        int positionIndex = r.getPositionIndex();
//        int positionIndex = setPositionIndex();
//        Random r = new Random();
//        int positionIndex = r.nextInt(1,10);
        if (positionIndex<=3) {
            this.row = 1;
        } else if (positionIndex<=6) {
            this.row = 2;
        } else {
            this.row = 3;
        }
//        return this.row;
//        this.row = row;
    }

    public void setColumn() {
        RandomNumber r = new RandomNumber();
        int positionIndex = r.getPositionIndex();
//        int positionIndex = setPositionIndex();
//        Random r = new Random();
//        int positionIndex = r.nextInt(1,10);
        column = positionIndex%3;
        if (column==0) {
            column = 3;
        }
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

//    public int getPositionIndex() {
//        return positionIndex;
//    }
//
//    public void setPositionIndex(int positionIndex) {
//        this.positionIndex = positionIndex;
//    }
}
