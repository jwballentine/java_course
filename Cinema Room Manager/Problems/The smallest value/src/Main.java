import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        long firstNum = 1;

        long total = 1;

        while (total <= m) {
            total *= firstNum;
            firstNum++;
        }

        System.out.println(firstNum - 1);
    }
}