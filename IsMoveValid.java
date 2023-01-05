package org.example;

public class IsMoveValid {

//    humanMove myTurn = new humanMove();
    public boolean IsSpaceVacant(char[][] board, int row, int column) {
        if (board[row][column]==' ') {
            return true;
        } else {
            return false;
        }
    }

}
