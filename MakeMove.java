//package org.example;
//import java.util.Scanner;
//import java.util.Random;
//import java.lang.Math;
//import java.util.Set;
//
//public interface MakeMove {
//
//    void setRow(int rowChoice);
//
//    void setColumn(int rowChoice);
//
//    void setPiece(char noughtOrCross);
//
////    void setMove(int[] array);
//
//}
//
//class HumanTurn implements MakeMove {
//
//    private humanMove rowChoice = new humanMove();
//    private int row = rowChoice.getLine();
//
//    private humanMove columnChoice = new humanMove();
//    private int column = columnChoice.getLine();
//
//    private char piece = 'x';
//
//    public void setRow(int rowChoice) {
//        this.row = row;
//    }
//
//    public void setColumn(int columnChoice) {
//        this.column = column;
//    }
//
//    public void setPiece(char noughtOrCross) {
//        this.piece = piece;
//    }
//
//    public int getRow() {
//        return this.row;
//    }
//
//    public int getColumn() {
//        return this.column;
//    }
//
//    public char getPiece() {
//        return this.piece;
//    }
//
////    private int[] move = new int[2];
//
////    public void setMove(int[] array) {
////        move[0] = row;
////        move[1] = column;
////        this.move = move;
////    }
////
////    public int[] getMove() {
////        return this.move;
////    }
//
//}
//
//class AITurn implements MakeMove {
//
////    private RandomNumber randomiser = new RandomNumber();
////    private int randomNumber = randomiser.getPositionIndex();
//    private int positionIndex;
//
//    private int row;
//
//    private int column;
//
////    private AIMove rowChoice = new AIMove();
////    private int row = rowChoice.getLine();
////
////    private AIMove columnChoice = new AIMove();
////    private int column = columnChoice.getLine();
//
//    private char piece = 'o';
//
//    public int setPositionIndex() {
//        this.positionIndex = new Random().ints(1,1,10).findFirst().getAsInt();
//    }
//
//    public void setRow() {
//        int positionIndex = setPositionIndex();
//        if (positionIndex<=3) {
//            this.row = 1;
//        } else if (positionIndex<=6) {
//            this.row = 2;
//        } else {
//            this.row = 3;
//        }
//        this.row = row;
//    }
//
//    public void setColumn() {
//        int positionIndex = setPositionIndex();
//        column = positionIndex%3;
//        if (column==0) {
//            column = 3;
//        }
//        this.column = column;
//    }
//
//    public void setPiece(char noughtOrCross) {
//        this.piece = piece;
//    }
//
//    public int getRow() {
//        return this.row;
//    }
//
//    public int getColumn() {
//        return this.column;
//    }
//
//    public char getPiece() {
//        return this.piece;
//    }
//
////    private int move[] = new int[2];
//
////    public void setMove(int[] array) {
////        move[0] = row;
////        move[1] = column;
////        this.move = move;
////    }
////
////    public int[] getMove() {
////        return this.move;
////    }
//
//}