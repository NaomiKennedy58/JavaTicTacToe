package org.example;

public class CheckLine {

    private int row;

    private int column;

//    private int[] chosenPosition;

    private int vacantPosition;

    public int findVacantPosition(char[] line) {

        for (int i=0; i<3; i++) {
            if (line[i]==' ') {
                vacantPosition = i;
            }
        }

        return vacantPosition;
    }

    public int[] choosePosition(String lineType, int vacantPosition, int index) {

        int[] chosenPosition = new int[2];

        if (lineType=="row") {
            row = index;
            column = vacantPosition;
//            chosenPosition = [index, vacantPosition];
        } else if (lineType=="column") {
            row = vacantPosition;
            column = index - 3;
        } else if (lineType=="leadDiagonal") {
            row = vacantPosition;
            column = vacantPosition;
        } else if (lineType=="reverseDiagonal") {
            row = vacantPosition;
            column = 2 - vacantPosition;
        }
        chosenPosition[0] = row;
        chosenPosition[1] = column;
        return chosenPosition;
//        return [row, column];
    }

}
