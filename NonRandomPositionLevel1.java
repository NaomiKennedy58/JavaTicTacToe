package org.example;

public class NonRandomPositionLevel1 {

//    private int row;
//
//    private int column;

    private String lineType;

    private int[] position = new int[2];

    private char[] testLine = new char[3];

    private CheckLine lineChecker = new CheckLine();

    public int[] bestMove(char[][] board, int index) {

        if (index<=2) {
            testLine = board[index];
            lineType = "row";
        } else if (index<=5) {
            int column = index - 3;
            for (int i=0; i<3; i++) {
                testLine[i] = board[i][column];
            }
            lineType = "column";
        } else if (index==6) {
            for (int j=0; j<3; j++) {
                testLine[j] = board[j][j];
            }
            lineType = "leadDiagonal";
        } else {
            for (int k=0; k<3; k++) {
                testLine[k] = board[k][2-k];
            }
            lineType = "reverseDiagonal";
        }
        
        int playHere = lineChecker.findVacantPosition(testLine);
        int[] PlayHere = lineChecker.choosePosition(lineType, playHere, index);
        return PlayHere;
//        return this.lineType;
//        return testLine;
    }

}
