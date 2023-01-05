package org.example;

public class DisplayBoard {

//    String line = " ";

//    String position1;
//    String position2;
//    String position3;

    public static void showBoard(char[][] board) {
        for (int i=0; i<3; i++) {
            String line = "|";
            for (int j=0; j<3; j++) {
                line = line + Character.toString(board[i][j]);
                line = line + "|";
            }
            System.out.println(line);
            if (i<2) {
                System.out.println("-------");
            }
        }
        System.out.println(" ");
    }

}
