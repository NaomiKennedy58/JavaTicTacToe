package org.example;
import java.util.Scanner;

public class NumberChooser {

    private Scanner input = new Scanner(System.in);

    private String levelSelected = input.nextLine();

    public void setNumber(String levelSelected) {
        this.levelSelected = levelSelected;
    }

    public String getNumber() {
        return this.levelSelected;
    }

}
