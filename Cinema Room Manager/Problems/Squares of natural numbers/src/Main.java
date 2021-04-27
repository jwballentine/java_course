import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int start = 1;

        while (Math.pow(start, 2) <= num) {
            System.out.println((int) Math.pow(start, 2));
            start++;
        }
    }
}