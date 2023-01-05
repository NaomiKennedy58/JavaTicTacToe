package org.example;
import java.util.Random;
import java.util.Scanner;

public interface Move {

    void setLine(int lineSelected);

}

class humanMove implements Move {

    private Scanner input = new Scanner(System.in);

    private int lineSelected = input.nextInt();

    public void setLine(int lineSelected) {
        this.lineSelected = lineSelected;
    }

    public int getLine() {
        return this.lineSelected;
    }

}

class AIMove implements Move {

    private int lineSelected = new Random().ints(1,1,4).findFirst().getAsInt();

    public void setLine(int lineSelected) {
        this.lineSelected = lineSelected;
    }

    public int getLine() {
        return this.lineSelected;
    }

}