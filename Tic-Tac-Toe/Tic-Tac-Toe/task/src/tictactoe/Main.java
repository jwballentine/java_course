package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static char[][] gameBoard = new char[3][3];

    private static boolean xTurn = true;

    public static void main(String[] args) {
        // write your code here
//        System.out.println("X O X");
//        System.out.println("O X O");
//        System.out.println("X X O");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = ' ';
            }
        }

        printBoard();
//        String input = scanner.nextLine();
//

//
//        String line1 = input.substring(0, 3);
//        String line2 = input.substring(3, 6);
//        String line3 = input.substring(6);
//
//        System.out.println("Enter cells: " + input);
//
//        System.out.println("---------");
//
//        spaceOut(line1);
//        spaceOut(line2);
//        spaceOut(line3);
//
//        System.out.println("---------");

        boolean gameOver = false;

        while(!gameOver){
            System.out.println("Enter the coordinates:");

            String entry = scanner.nextLine();

            String value = checkCoordinates(entry);

            if (value == "good") {
                //Change the game board
                printBoard();
                String result = checkResult();

                if(result != "Game not finished") {
                    System.out.println(result);
                    gameOver = true;
                }

            } else {
                System.out.println(value);
            }

        }



//        checkResult(input);
    }

    public static void spaceOut(String line) {
        System.out.print("| ");

        for (int i = 0; i < 3; i++){
            System.out.print(line.charAt(i) + " ");
        }

        System.out.println("|");

    }

    public static void printBoard(){

        System.out.println("---------");

        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("---------");
    }

    public static String checkResult() {
//        char[][] board = new char[3][3];

        int numWinningRows = 0;
        char winner = ' ';
        int numX = 0;
        int numO = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(gameBoard[i][j] == 'X'){
                    numX++;
                } else if(gameBoard[i][j] == 'O') {
                    numO++;
                }
            }
        }
//        System.out.println(line);
//        System.out.println(Arrays.deepToString(board));

        char[] topRow = new char[3];
        char[] midRow = new char[3];
        char[] btmRow = new char[3];
        char[] leftCol = new char[3];
        char[] centerCol = new char[3];
        char[] rightCol = new char[3];
        char[] diagLeft = new char[3];
        char[] diagRight = new char[3];

        for (int i = 0; i < 3; i++) {
            topRow[i] = gameBoard[0][i];
            midRow[i] = gameBoard[1][i];
            btmRow[i] = gameBoard[2][i];
            leftCol[i] = gameBoard[i][0];
            centerCol[i] = gameBoard[i][1];
            rightCol[i] = gameBoard[i][2];
            diagLeft[i] = gameBoard[i][i];
            diagRight[i] = gameBoard[2-i][i];
        }


//        for( char s : line.toCharArray()) {
//            if(s == 'X') {
//                numX++;
//            } else if (s == 'O') {
//                numO++;
//            }
//        }
//
//        if (numO - numX >  1 || numO - numX < -1) {
//            System.out.println("Impossible");
//            return;
//        } else if (numO < 3 && numX < 3) {
//            System.out.println("Game not finished");
//            return;
//        }

        if(rowGood(topRow)){
            numWinningRows++;
            winner = topRow[0];
//            System.out.println("top");
        }
        if(rowGood(midRow)){
            numWinningRows++;
            winner = midRow[0];
//            System.out.println("mid");
        }
        if(rowGood(btmRow)){
            numWinningRows++;
            winner = btmRow[0];
//            System.out.println("btm");
        }
        if(rowGood(leftCol)){
            numWinningRows++;
            winner = leftCol[0];
        }
        if(rowGood(centerCol)){
            numWinningRows++;
            winner = centerCol[0];
        }
        if(rowGood(rightCol)){
            numWinningRows++;
            winner = rightCol[0];
        }
        if(rowGood(diagLeft)){
            numWinningRows++;
            winner = diagLeft[0];
//            System.out.println("diagl");
        }
        if(rowGood(diagRight)){
            numWinningRows++;
            winner = diagRight[0];
//            System.out.println("diagr");
//            System.out.println(diagRight);
        }

        System.out.println(numWinningRows);

        if(numWinningRows >= 1) {
            String win = Character.toString(winner);
//            System.out.println(win + " wins");
            return win + " wins";
        } else if (numWinningRows == 0 && numX + numO < 9){
//            System.out.println("Game not finished");
            return "Game not finished";
        } else if(numWinningRows == 0 && numO + numX == 9){
            System.out.println("Draw");
            return "Draw";
        }

        return "Ok";
    }

    public static boolean rowGood(char[] row) {
        boolean pass = true;
        char starterChar = row[0];

        if(starterChar == ' ' || starterChar == '_') {
            return false;
        }

        for (int i = 1; i < 3; i++) {
            if(row[i] != starterChar){
                pass = false;
            }
        }

        return pass;
    }

    public static String checkCoordinates(String entry) {

        if (Character.isDigit(entry.charAt(0)) && Character.isDigit(entry.charAt(0))) {
            int firstCoordinate = Character.getNumericValue(entry.charAt(0));
            int secondCoordinate = Character.getNumericValue(entry.charAt(2));

            if(firstCoordinate > 3 || firstCoordinate < 1 || secondCoordinate > 3 || secondCoordinate < 1){
                return "Coordinates should be from 1 to 3";
            }

            if(gameBoard[firstCoordinate - 1][secondCoordinate - 1] != ' ') {
                return "This cell is occupied! Choose another one!";
            }

            if(firstCoordinate <= 3 || firstCoordinate >= 1 || secondCoordinate <= 3 || secondCoordinate >= 1){
                char marker = xTurn ? 'X' : 'O';

                gameBoard[firstCoordinate - 1][secondCoordinate - 1] = marker;
                xTurn = !xTurn;
                return "good";
            }

        } else {
            return "You should enter numbers!";
        }

        return "good";
    }
}
