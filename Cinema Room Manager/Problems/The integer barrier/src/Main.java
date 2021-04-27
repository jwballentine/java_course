import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNext()) {
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println(sum);
                break;
            }

            sum += num;

            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}