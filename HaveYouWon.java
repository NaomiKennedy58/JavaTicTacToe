package org.example;

import java.lang.*;

public class HaveYouWon {

    public boolean Winner(int[][] lineTotals, int TurnCount) {

        for (int i=0; i<8; i++) {
            if (lineTotals[i][TurnCount]==3) {
                return true;
            }
        }

        return false;

//        if (board[row][0]==board[row][1] & board[row][1]==board[row][2]) {
//            return true;
//        } else if (board[0][column]==board[1][column] & board[1][column]==board[2][column]) {
//            return true;
//        } else if (row==column & board[0][0]==board[1][1] & board[1][1]==board[2][2]) {
//            return true;
//        } else if (row+column==2 & board[0][2]==board[1][1] & board[1][1]==board[2][0]) {
//            return true;
//        }
//
//        return false;

    }

}
