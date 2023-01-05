package org.example;

public interface DeterminePlayerOrder {

    void setPlayerOne(String playerType);

    void setPlayerTwo(String playerType);

    void setPieceOne(char noughtOrCross);

    void setPieceTwo(char noughtOrCross);

}

class HumanFirst implements DeterminePlayerOrder {

    private String playerOne = "HUMAN";
    private String playerTwo = "AI";
    private char pieceOne = 'x';
    private char pieceTwo = 'o';

    public void setPlayerOne(String PlayerType) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String PlayerType) {
        this.playerTwo = playerTwo;
    }

    public void setPieceOne(char noughtOrCross) {
        this.pieceOne = pieceOne;
    }

    public void setPieceTwo(char noughtOrCross) {
        this.pieceTwo = pieceTwo;
    }

    public String getPlayerOne() {
        return this.playerOne;
    }

    public String getPlayerTwo() {
        return this.playerTwo;
    }

    public char getPieceOne() {
        return this.pieceOne;
    }

    public char getPieceTwo() {
        return this.pieceTwo;
    }

}

class AIFirst implements DeterminePlayerOrder {

    private String playerOne = "AI";
    private String playerTwo = "HUMAN";
    private char pieceOne = 'o';
    private char pieceTwo = 'x';

    public void setPlayerOne(String PlayerType) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String PlayerType) {
        this.playerTwo = playerTwo;
    }

    public void setPieceOne(char noughtOrCross) {
        this.pieceOne = pieceOne;
    }

    public void setPieceTwo(char noughtOrCross) {
        this.pieceTwo = pieceTwo;
    }

    public String getPlayerOne() {
        return this.playerOne;
    }

    public String getPlayerTwo() {
        return this.playerTwo;
    }

    public char getPieceOne() {
        return this.pieceOne;
    }

    public char getPieceTwo() {
        return this.pieceTwo;
    }

}