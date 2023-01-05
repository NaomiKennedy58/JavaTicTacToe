package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadGame {

    private char[][] currentBoard;

    private int currentTurn;

    private int firstPlayer;

    public void setCurrentBoard() {
        try {
            File loadUp = new File("boardState.txt");
            Scanner reader = new Scanner(loadUp);
            String findBoard = reader.nextLine();
            char[] findBoard2 = findBoard.toCharArray();
            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    currentBoard[i][j] = findBoard2[3*i+j];
                }
            }
            this.currentBoard = currentBoard;
            String findTurn = reader.nextLine();
            int currentTurn = Integer.valueOf(findTurn);
            this.currentTurn = currentTurn;
            String findFirstPlayer = reader.nextLine();
            int firstPlayer = Integer.valueOf(findFirstPlayer);
            this.firstPlayer = firstPlayer;
//            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("The reloading is not working.");
            e.printStackTrace();
        }
    }

    public char[][] getCurrentBoard() {
        return this.currentBoard;
    }

    public int getCurrentTurn() {
        return this.currentTurn;
    }

    public int getFirstPlayer() {
        return this.firstPlayer;
    }

}
