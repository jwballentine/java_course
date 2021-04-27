import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean answer = true;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == m && arr[i + 1] == n || arr[i] == n && arr[i + 1] == m) {
                answer = false;
                break;
            }

        }

        System.out.println(answer);
    }
}