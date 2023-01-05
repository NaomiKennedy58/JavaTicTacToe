package org.example;

public class CheckTwoInLine {

//    private int[] options = [];

//    private int[] testLine = new int[3];

    private int index;

    public int playHere(int[][] lineTotals) {

        for (int i=0; i<8; i++) {
            if (lineTotals[i][2]==1 & (lineTotals[i][0]==2 | lineTotals[i][1]==2)) {
                index = i;
                return index;
            }
        }

        index = 10;
        return index;

    }

    public int playHere1(int[][] lineTotals) {
        for (int i = 0; i < 8; i++) {
            if (lineTotals[i][2]==2 & (lineTotals[i][0]==1 | lineTotals[i][1]==1)) {
                index = i;
                return index;
            }
        }
        index = 10;
        return index;
    }

}
