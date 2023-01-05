package org.example;

import java.util.Scanner;

public interface ChooseDifficulty {

    void setDifficulty(String levelChosen);

}

class DifficultyChoice implements ChooseDifficulty {

    private Scanner input = new Scanner(System.in);

    private String levelSelected = input.nextLine();

    public void setDifficulty(String levelSelected) {
//        System.out.println("Choose a difficulty level. 1 is easy, 2 is medium.");
        this.levelSelected = levelSelected;
    }

    public String getDifficulty() {
        return this.levelSelected;
    }

}