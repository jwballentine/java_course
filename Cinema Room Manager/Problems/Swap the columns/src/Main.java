import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] twoDArr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoDArr[i][j] = scanner.nextInt();
            }
        }

        int pos1 = scanner.nextInt();
        int pos2 = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            int holder1 = twoDArr[i][pos1];
            int holder2 = twoDArr[i][pos2];

            twoDArr[i][pos1] = holder2;
            twoDArr[i][pos2] = holder1;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == col - 1) {
                    System.out.println(twoDArr[i][j]);
                } else {
                    System.out.print(twoDArr[i][j] + " ");
                }


            }
        }
    }
}