package org.example;

public class OpenGame {

    public char[][] loadCurrentBoard(String boardString) {
//        IndexToPosition positionIndicator = new IndexToPosition();
        Board gameBoard = new Board();
        char[][] GameBoard = gameBoard.setInitialBoard();
        int row = 0;
        int column = 0;
        for (int i=0; i<13; i++) {
            if (boardString.charAt(i)!='/') {
                GameBoard[row][column] = boardString.charAt(i);
                column = column + 1;
                if (column==3) {
                    column = 0;
                    row = row + 1;
                }
            }
        }
        return GameBoard;
    }

    public int loadTurnNumber(String boardString) {
        char turnNumber = boardString.charAt(13);
        int TurnNumber = Integer.parseInt(String.valueOf(turnNumber));
        return TurnNumber + 1;
    }

    public int loadPlayerIndex(String boardString) {
        char playerIndex = boardString.charAt(14);
        int PlayerIndex = Integer.parseInt(String.valueOf(playerIndex));
        return PlayerIndex;
    }

    public int loadDifficulty(String boardString) {
        char level = boardString.charAt(15);
        int Level = Integer.parseInt(String.valueOf(level));
        return Level;
    }

}
