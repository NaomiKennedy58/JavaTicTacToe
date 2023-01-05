package org.example;

class Board {

    private char[][] board = new char[3][3];

    public char[][] setInitialBoard() {
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }

    public char[][] setNewBoard(char[][] board, int row, int column, char piece) {
        board[row][column] = piece;
        this.board = board;
        return board;
    }

    public char[][] getNewBoard() {
        return board;
    }

}
