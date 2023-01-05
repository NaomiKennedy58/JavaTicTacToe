package org.example;

public interface InitialPlayer {

    void setTypeOfPlayer(String playerType);

    void setPiece(char noughtOrCross);

}

class HumanPlayer implements InitialPlayer {

    private String playerType = "HUMAN";

    private char piece = 'x';

    public void setTypeOfPlayer(String playerType) {
        this.playerType = playerType;
    }

    public void setPiece(char noughtOrCross) {
        this.piece = piece;
    }

    public String getTypeOfPlayer() {
        return this.playerType;
    }

    public char getPiece() {
        return this.piece;
    }

}

class ComputerPlayer implements InitialPlayer {

    private String playerType = "AI";

    private char piece = 'o';

    public void setTypeOfPlayer(String playerType) {
        this.playerType = playerType;
    }

    public void setPiece(char noughtOrCross) {
        this.piece = piece;
    }

    public String getTypeOfPlayer() {
        return this.playerType;
    }

    public char getPiece() {
        return this.piece;
    }

}