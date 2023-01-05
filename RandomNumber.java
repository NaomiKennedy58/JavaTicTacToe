package org.example;

import java.util.Random;

public class RandomNumber {

    private int positionIndex;

    public void setPositionIndex() {
        int positionIndex = new Random().ints(1,1,10).findFirst().getAsInt();
        this.positionIndex = positionIndex;
//        return positionIndex;
    }

    public int getPositionIndex() {
        return this.positionIndex;
    }

}
