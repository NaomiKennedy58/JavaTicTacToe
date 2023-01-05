package org.example;

public class LineTotals {

//    private int lineFill = 0;

    private int[][] numberInEachLine = new int[8][4];

    public int[][] setInitialLineTotals() {
        for(int i=0; i<8; i++) {
            numberInEachLine[i][0] = 0;
            numberInEachLine[i][1] = 0;
            numberInEachLine[i][2] = 3;
//            numberInEachLine[i][3] = 10;
        }
        return numberInEachLine;
    }

    public int[][] setNewTotals(int[][] lineTotals, int row, int column, int turnCount) {

//        int effectiveColumn = column + 3;

//        if (piece=='x') {
//            int lineFill = 0;
//        } else if (piece=='o') {
//            int lineFill = 1;
//        }
//        int LineFill = lineFill;
        lineTotals[row][turnCount] = lineTotals[row][turnCount] + 1;
        lineTotals[row][2] = lineTotals[row][2] - 1;
        lineTotals[column+3][turnCount] = lineTotals[column+3][turnCount] + 1;
        lineTotals[column+3][2] = lineTotals[column+3][2] - 1;

        if (row==column) {
            lineTotals[6][turnCount] = lineTotals[6][turnCount] + 1;
            lineTotals[6][2] = lineTotals[6][2] - 1;
        }

        if (row+column==2) {
            lineTotals[7][turnCount] = lineTotals[7][turnCount] + 1;
            lineTotals[7][2] = lineTotals[7][2] - 1;
        }

        return lineTotals;
    }

}
