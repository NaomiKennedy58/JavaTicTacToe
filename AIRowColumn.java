package org.example;

import java.lang.Math;

public interface AIRowColumn {

    void setRow(int position);

    void setColumn(int position);

}

class DetermineRowAndColumn implements AIRowColumn {

    private RandomNumber r = new RandomNumber();
    private double position = r.getPositionIndex();

    private double Row = Math.ceil(position/3);

    private int row = (int)Row;

    private double Column = position%3;

    private int column = (int)Column;

//    private int row;
//    private int column;

//    public void setPosition(int position) {
//        this.position = position;
//    }

//    if (position<=3) {
//        int row = 1;
//    } else if (position<=6) {
//        int row = 2;
//    } else {
//        int row = 3;
//    }

    public void setRow(int row) {
        this.row = row;
//        if (position<=3) {
//            this.row = 1;
//        } else if (position<=6) {
//            this.row = 2;
//        } else {
//            this.row = 3;
//        }
    }

    public void setColumn(int column) {
//        int columnIndex = position%3;
//        if (column==0) {
//            column = 3;
//        }
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

}