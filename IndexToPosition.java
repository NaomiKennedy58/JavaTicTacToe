package org.example;

public class IndexToPosition {

    int row;

    int column;

    public int findRow(int index) {
        if (index<4) {
            row = 0;
        } else if (index<8) {
            row = 1;
        } else {
            row = 2;
        }
        return row;
    }

    public int findColumn(int index) {
        column = index%4;
        return column;
    }

}
