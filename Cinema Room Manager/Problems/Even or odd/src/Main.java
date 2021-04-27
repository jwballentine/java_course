import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int nextNum = scanner.nextInt();

            if (nextNum == 0) {
                break;
            }
            if (nextNum % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}