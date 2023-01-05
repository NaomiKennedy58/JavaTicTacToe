package org.example;

public class HumanTurn {

    private humanMove rowChoice = new humanMove();
    private int row = rowChoice.getLine();

    private humanMove columnChoice = new humanMove();
    private int column = columnChoice.getLine();

    private char piece = 'x';

    public void setRow(int rowChoice) {
        this.row = row;
    }

    public void setColumn(int columnChoice) {
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

}
