import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        int inputNum = scanner.nextInt();

        do {
            total += inputNum;
            if (scanner.hasNext()) {
                inputNum = scanner.nextInt();
            } else {
                inputNum = 0;
            }

        } while (inputNum != 0);

        System.out.println(total);
    }
}