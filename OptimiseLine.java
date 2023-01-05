package org.example;

public class OptimiseLine {

    private int index;

    public int checkOneInLine(int[][] lineTotals) {

        for (int i=0; i<8; i++) {
            if (lineTotals[i][2]==2) {
                index = i;
                return index;
            }
        }

        index = 10;
        return index;

    }

    public int checkTwoInLine(int[][] lineTotals) {

        for (int i=0; i<8; i++) {
            if (lineTotals[i][2]==1 & (lineTotals[i][0]==2 | lineTotals[i][1]==2)) {
                index = i;
                return index;
            }
        }

        index = 10;
        return index;

    }

}
