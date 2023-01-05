package org.example;

import java.util.Random;

public interface SwitchPlayer {

    void setCurrentPlayer(int currentPlayer);

    void setTypeOfPlayer(String playerType);

    void setPiece(char noughtOrCross);

}

class BeginPlayer implements SwitchPlayer {

    private int playerIndex = new Random().ints(1,1,3).findFirst().getAsInt();

    private String humanOrAI;

    private char piece;

    public void setCurrentPlayer(int currentPlayer) {
        this.playerIndex = playerIndex;
    }

    public void setTypeOfPlayer(String playerType) {
        if (playerIndex==1) {
            this.humanOrAI = "HUMAN";
        } else if (playerIndex==2) {
            this.humanOrAI = "AI";
        }
    }

    public void setPiece(char noughtOrCross) {
        if (playerIndex==1) {
            this.piece = 'x';
        } else if (playerIndex==2) {
            this.piece = 'o';
        }
    }

    public int getCurrentPlayer() {
        return this.playerIndex;
    }

    public String getTypeOfPlayer() {
        return this.humanOrAI;
    }

    public char getPiece() {
        return this.piece;
    }

}

class NextPlayer extends BeginPlayer {

    private int playerIndex = super.getCurrentPlayer();

    private String playerType = super.getTypeOfPlayer();

    private char piece = super.getPiece();

    public void setCurrentPlayer() {
        if (playerIndex==1) {
            this.playerIndex = 2;
        } else if (playerIndex==2) {
            this.playerIndex = 1;
        }
    }

    public void setTypeOfPlayer() {
        if (playerType=="HUMAN") {
            this.playerType = "AI";
        } else if (playerType=="AI") {
            this.playerType = "HUMAN";
        }
    }

    public void setPiece() {
        if (piece=='x') {
            this.piece = 'o';
        } else if (piece=='o') {
            this.piece = 'x';
        }
    }

    public int getCurrentPlayer() {
        return this.playerIndex;
    }

    public String getTypeOfPlayer() {
        return this.playerType;
    }

    public char getPiece() {
        return this.piece;
    }

}