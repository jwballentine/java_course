import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] twoArr = new int[row][col];
        int[][] rotArr = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoArr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rotArr[j][row - i - 1] = twoArr[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (j == row - 1) {
                    System.out.println(rotArr[i][j]);
                } else {
                    System.out.print(rotArr[i][j] + " ");
                }
            }
        }

    }
}