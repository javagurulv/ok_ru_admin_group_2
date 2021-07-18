package student_dmitry_samsonov.lesson_6.level_7_senior;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean win;
        for (int[] i: field) {
            win = true;
            for (int k: i) {
                if (k != playerToCheck) {
                    win = false;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean win;
        for (int i=0; i<field.length; i++) {
            win = true;
            for (int[] k: field) {
                if (k[i] != playerToCheck) {
                    win = false;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        boolean win;
        // left upper corner to right lower
        win = true;
        for (int i=0; i<field.length; i++) {
            for (int k=0; k<field[i].length; k++) {
                if (i == k && field[i][k] != playerToCheck) {
                    win = false;
                }
            }
        }
        if (win) {
            return true;
        }
        // lright upper corner to left lower
        win = true;
        for (int i=0; i<field.length; i++) {
            for (int k=0; k<field[i].length; k++) {
                if (i + k == field.length - 1 && field[i][k] != playerToCheck) {
                    win = false;
                }
            }
        }
        if (win) {
            return true;
        }
        return false;
    }
    public boolean isWinPosition(int[][] field, int playerToCheck){
        return (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck));
    }
    public boolean isFieldFilled(int[][] field){
        for (int[] i: field) {
            for (int k: i) {
                if (k == -1){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isDrawPosition(int[][] field){
        if (!isFieldFilled(field)) {
            return false;
        }
        for (int i=0; i<=1; i++){
            if (isWinPosition(field, i)) {
                return false;
            }
        }
        return true;
    }
    public int[][] createField(){
        int defaultFieldValue = -1;
        int fieldLength = 3;
        int[][] field = new int[fieldLength][fieldLength];
        for (int i=0; i<fieldLength; i++) {
            for (int k=0; k<fieldLength; k++){
                field[i][k] = defaultFieldValue;
            }
        }
        return field;
    }
    public void printFieldToConsole(int[][] field) {
        System.out.println("Current field:");
        String prefix;
        for (int i=0; i<field.length; i++) {
            for (int k=0; k<field.length; k++){
                if (field[i][k] == -1){
                    prefix = "";
                } else {
                    prefix = " ";
                }
                System.out.print(prefix + field[i][k]);
            }
            System.out.println("");
        }
    }
    public Move getNextMove() {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = ask.nextInt();
        System.out.println("Enter Y:");
        int y = ask.nextInt();
        Move move = new Move(x, y);
        return move;
    }
    public Move generateNextMove() {
        int fieldLength = 3;
        Random random = new Random();
        int x = random.nextInt(fieldLength);
        int y = random.nextInt(fieldLength);
        Move move = new Move(x, y);
        return move;
    }
    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
    public void playAI() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }


            Move move1 = generateNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter players count ('1 or 2'):");
        int players = ask.nextInt();
        if (players == 1) {
            game.playAI();
        } else if (players == 2) {
            game.play();
        }
    }
}
