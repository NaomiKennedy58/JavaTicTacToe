package org.example;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

//        int[] options;
//        options = new int[]{1,2,3};
        int turnCount;
        char piece;
        int oneIndex;
        int twoIndex;
        String difficulty;
        int level;
        boolean allowedMove;
        boolean rowAllowed;
        boolean columnAllowed;
        String newBoardString;
//        NumberChooser numberChoice = new NumberChooser();
        RestrictNumberChoice possibleNumbers = new RestrictNumberChoice();
        List<Integer> allowedNumbers = possibleNumbers.availableNumbers();
//        NumberChooser lineChosen = new NumberChooser();

        System.out.println("Choose a difficulty level. 1 is easy, 2 is medium, 3 is hard.");
        NumberChooser levelChosen = new NumberChooser();
        difficulty = levelChosen.getNumber();
        try {
            level = Integer.parseInt(difficulty);
        } catch(NumberFormatException e) {
            level = 10;
        }
        allowedMove = possibleNumbers.isThisNumberOk(allowedNumbers, level);
        if (!allowedMove) {
            level = 1;
            System.out.println("You did not enter a valid difficulty level, so it has automatically been set to easy.");
        }

        IsMoveValid emptySpace = new IsMoveValid();
        HaveYouWon threeInALine = new HaveYouWon();
        DisplayBoard Display = new DisplayBoard();
        PieceChooser givePiece = new PieceChooser();
        LineTotals recordLines = new LineTotals();
        CheckTwoInLine oneChecker = new CheckTwoInLine();
        CheckTwoInLine twoChecker = new CheckTwoInLine();
        int[][] lineTotals = recordLines.setInitialLineTotals();
        NonRandomPositionLevel1 mediumTactics = new NonRandomPositionLevel1();
        NonRandomPositionLevel1 hardTactics = new NonRandomPositionLevel1();
        final int playerIndex = new Random().ints(1, 1, 3).findFirst().getAsInt();
        Board gameBoard = new Board();
        char[][] GameBoard = gameBoard.setInitialBoard();
        Display.showBoard(GameBoard);
        boolean victory = false;

        for (int i=0; i<9; i++) {
            turnCount = i + playerIndex;
            int TurnCount = turnCount % 2;
            boolean validMove = false;
            piece = givePiece.setPiece(TurnCount);
            int row = 10;
            int column = 10;
            if (TurnCount==1) {
                System.out.println("First, choose a row to play in, followed by a column");
                while (!validMove) {
//                    HumanTurn play = new HumanTurn();
//                    row = play.getRow();
//                    column = play.getColumn();
//                    String row = "10";
//                    String column = "10";
                    NumberChooser rowChosen = new NumberChooser();
                    NumberChooser columnChosen = new NumberChooser();
                    String Row = rowChosen.getNumber();
                    String Column = columnChosen.getNumber();
                    try {
                        row = Integer.parseInt(Row);
                        column = Integer.parseInt(Column);
                    } catch(NumberFormatException e) {
                        row = 1;
                        column = 1;
                        System.out.println("You did not enter a valid move, so instead it has been assigned to the top-left corner.");
                    }
                    rowAllowed = possibleNumbers.isThisNumberOk(allowedNumbers, row);
                    columnAllowed = possibleNumbers.isThisNumberOk(allowedNumbers, column);
                    validMove = emptySpace.IsSpaceVacant(GameBoard, row-1, column-1);
                    if (!validMove | !rowAllowed | !columnAllowed) {
                        System.out.println("That is not a valid move. Choose a vacant square to play in.");
                    }
                }
            } else if (TurnCount == 0) {
//                int row = 10;
//                int column = 10;
                while (!validMove) {
                    oneIndex = oneChecker.playHere1(lineTotals);
                    twoIndex = twoChecker.playHere(lineTotals);
                    if (level>=2 & twoIndex < 10) {
                        int[] rowColumn = mediumTactics.bestMove(GameBoard, twoIndex);
                            row = rowColumn[0] + 1;
                            column = rowColumn[1] + 1;
                    } else if (level==3 & oneIndex<10 & twoIndex==10) {
                        int[] rowColumn = hardTactics.bestMove(GameBoard, oneIndex);
                        row = rowColumn[0] + 1;
                        column = rowColumn[1] + 1;
                    } else {
                        int positionIndex = new Random().ints(1, 1, 10).findFirst().getAsInt();
                        if (positionIndex <= 3) {
                            row = 1;
                        } else if (positionIndex <= 6) {
                            row = 2;
                        } else {
                            row = 3;
                        }
                        column = positionIndex % 3;
                        if (column == 0) {
                            column = 3;
                        }
                    }
                    validMove = emptySpace.IsSpaceVacant(GameBoard, row-1, column-1);
                }
            }
            if (validMove) {
                GameBoard = gameBoard.setNewBoard(GameBoard, row-1, column-1, piece);
                lineTotals = recordLines.setNewTotals(lineTotals, row-1, column-1, TurnCount);
                victory = threeInALine.Winner(lineTotals, TurnCount);
            }
            if (victory==true) {
                System.out.println("The " + piece + " player has won.");
                Display.showBoard(GameBoard);
                break;
            } else if (i==8 & !victory) {
                System.out.println("This game has ended in a draw.");
                break;
            }
            Display.showBoard(GameBoard);
            Scanner input = new Scanner(System.in);
            System.out.println("If you want to save the game, type s. To continue, type d.");
            char save = input.next().charAt(0);
            if (save=='s') {
                char turnsDone = Integer.toString(i).charAt(0);
                char firstPlayer = Integer.toString(playerIndex).charAt(0);
                String boardString = "/" + GameBoard[0][0] + GameBoard[0][1] + GameBoard[0][2] + "/" + GameBoard[1][0] + GameBoard[1][1] + GameBoard[1][2] + "/" + GameBoard[2][0] + GameBoard[2][1] + GameBoard[2][2] + "/" + turnsDone + firstPlayer + difficulty;
                System.out.println(i);
                System.out.println(playerIndex);
                try {
                FileOutputStream saver = new FileOutputStream("boardState.txt");
                ObjectOutputStream savedFile = new ObjectOutputStream(saver);
                savedFile.writeObject(boardString);
                savedFile.flush();
                savedFile.close();

                FileInputStream loader = new FileInputStream("boardState.txt");
                ObjectInputStream loadedFile = new ObjectInputStream(loader);
                newBoardString = (String) loadedFile.readObject();
                loadedFile.close();
                } catch(FileNotFoundException e) {
                    boardString = "The saving and/or loading has failed.";
                    newBoardString = "So it has called an exception.";
                } catch(IOException e) {
                    boardString = "The saving and/or loading has failed.";
                    newBoardString = "So it has called an exception.";
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(boardString);
                System.out.println(newBoardString);
            }
//                byte[] currentState = boardString.getBytes();
//                String pathName = "boardState.txt";
//                Path file = Path.of(pathName);
//                try {
//                    Files.write(file, currentState);
//                    System.out.println("You have saved the game.");
//                } catch(IOException e) {
//                    throw new RuntimeException(e);
//                }
//                try {
//                    FileWriter partialGame = new FileWriter("boardState.txt");
//                    partialGame.write(String.valueOf(GameBoard));
//                    partialGame.write(String.valueOf(i));
//                    partialGame.write(String.valueOf(playerIndex));
//                    partialGame.close();
//                    System.out.println("You have saved the game.");
//                    break;
//                } catch (IOException e) {
//                    System.out.println("This is not working.");
//                    e.printStackTrace();
//                }
        }
    }
}