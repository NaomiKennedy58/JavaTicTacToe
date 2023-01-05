package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestrictNumberChoice {

    int[] options = new int[3];

    public List<Integer> availableNumbers() {
        List<Integer> options = new ArrayList<Integer>();
        for (int i=0; i<3; i++) {
            options.add(i+1);
        }
        return options;
    }

    public boolean isThisNumberOk(List<Integer> allowedNumbers, int candidateNumber) {
        boolean test = allowedNumbers.contains(candidateNumber);
        return test;
    }
}
