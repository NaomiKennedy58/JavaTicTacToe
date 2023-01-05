package org.example;

import java.util.Random;

public class FirstPlayer {

    final int playerIndex = new Random().ints(1,1,3).findFirst().getAsInt();
    private String playerType = " ";
    private char piece = ' ';

    public void setHumanOrAI(String humanOrAI) {
        if (playerIndex==1) {
            humanPlayer human = new humanPlayer();
            String Human = human.getTypeOfPlayer();
            this.playerType = Human;
        } else if (playerIndex==2) {
            AIPlayer AI = new AIPlayer();
            String Computer = AI.getTypeOfPlayer();
            this.playerType = Computer;
        }
    }

    public void setPiece(char noughtOrCross) {
        if (playerIndex==1) {
            this.piece = 'x';
        } else if (playerIndex==2) {
            this.piece = 'o';
        }
    }

    public String getPlayerType() {
//        System.out.println(this.playerType);
        return this.playerType;
    }

    public char getPiece() {
        return this.piece;
    }

}
