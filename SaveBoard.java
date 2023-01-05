package org.example;

import java.io.File;

public class SaveBoard {

    public File haltGame(char[][] board) {
        File savedGame = new File("GameBoard.txt");
        return savedGame;
    }

}
