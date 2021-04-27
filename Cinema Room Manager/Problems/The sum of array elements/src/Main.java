import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();

        int[] arr = new int[l];

        for (int i = 0; i < l; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println(sum);
    }
}