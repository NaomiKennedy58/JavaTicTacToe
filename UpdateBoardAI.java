package org.example;

public class UpdateBoardAI {

    private AITurn myTurn = new AITurn();

    private char[][] currentBoard;

    public void setNewBoard(int row, int column, char piece) {
        currentBoard[row-1][column-1] = piece;
    }

}
