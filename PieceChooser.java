package org.example;

public class PieceChooser {

    public static char piece;

    public char setPiece(int player) {
        if (player==1) {
            piece='x';
        } else if (player==0) {
            piece='o';
        }
        return piece;
    }

}
