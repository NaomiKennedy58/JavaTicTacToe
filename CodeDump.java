package org.example;

import java.util.Scanner;

public class CodeDump {

    int blockRow;
    int blockColumn;
    int oneIndex;

    boolean showLastMove = false;
    Scanner sc = new Scanner(System.in);

    IndexToPosition finder = new IndexToPosition();

    //            char[][] oldBoard = gameBoard.setInitialBoard();
    //            char[][] newBoard = gameBoard.setInitialBoard();

    //                        oldBoard = newBoard;

    //                    oneIndex = checker.checkOneInLine(lineTotals);

    //                        row = finder.findRow(twoIndex);
//                        column = finder.findColumn(twoIndex);
//                        System.out.println(row);
//                        System.out.println(column);
//                        System.out.println(twoIndex);

    //                        System.out.println(validMove);

    //                        if (validMove) {
//                            newBoard = gameBoard.setNewBoard(oldBoard, row-1, column-1, nought);
//                            lineTotals = recordLines.setNewTotals(lineTotals, row-1, column-1, TurnCount);
//                            oldBoard = newBoard;
//                        }

    //                        oldBoard = newBoard;

    //                    if (validMove) {
//                        victory = threeInALine.Winner(lineTotals, TurnCount);
//                    }

    //                    else if (difficulty==3 & oneIndex<10 & twoIndex==10) {
////                        int[] rowColumn = tactics.bestMove(oldBoard, oneIndex);
////                        row = rowColumn[0] + 1;
////                        column = rowColumn[1] + 1;
//                        row = finder.findRow(oneIndex);
//                        column = finder.findColumn(oneIndex);
//                        validMove = emptySpace.IsSpaceVacant(oldBoard, row, column);
//                        if (validMove) {
//                            newBoard = gameBoard.setNewBoard(oldBoard, row, column, nought);
//                            lineTotals = recordLines.setNewTotals(lineTotals, row, column, TurnCount);
//                            oldBoard = newBoard;
//                        }
//                        System.out.println(validMove);
////                            validMove = true;
//                        System.out.println(row);
//                        System.out.println(column);
//                        System.out.println(oneIndex);
//                    }

    //            Display.showBoard(GameBoard);
//            Scanner input = new Scanner(System.in);
//            System.out.println("If you want to save the game, type s. To continue, type d.");
//            char save = input.next().charAt(0);
//            if (save=='s') {
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
//                SaveBoard partialGame = new SaveBoard();
//                File boardState = partialGame.haltGame(GameBoard);
//            }
//                continue;
//            }

}
