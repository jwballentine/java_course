import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] twoDArr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    twoDArr[i][j] = 0;
                } else if (j < i) {
                    twoDArr[i][j] = i - j;
                } else if (j > i) {
                    twoDArr[i][j] = j - i;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1) {
                    System.out.println(twoDArr[i][j]);
                } else {
                    System.out.print(twoDArr[i][j] + " ");
                }
            }
        }
    }
}