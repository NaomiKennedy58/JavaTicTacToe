package org.example;

public interface Player {

    void setTypeOfPlayer(String playerType);

}

class humanPlayer implements Player {

    private String playerType = "HUMAN";

    public void setTypeOfPlayer(String playerType) {
        this.playerType = playerType;
    }

    public String getTypeOfPlayer() {
        return this.playerType;
    }

}

class AIPlayer implements Player {

    private String playerType = "AI";

    public void setTypeOfPlayer(String playerType) {
        this.playerType = playerType;
    }

    public String getTypeOfPlayer() {
        return this.playerType;
    }

}
