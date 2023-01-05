package org.example;

public class UpdateBoardHuman {

    private HumanTurn myTurn = new HumanTurn();

    private char[][] currentBoard;

    public void setNewHumanBoard(int row, int column, char piece) {
        currentBoard[row-1][column-1] = piece;
    }

}