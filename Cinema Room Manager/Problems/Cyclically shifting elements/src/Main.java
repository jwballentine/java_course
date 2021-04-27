import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int len = scanner.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        int holder = arr[0];

        for (int i = 0; i < len; i++) {
            if (i < len - 1) {
                int temp = arr[i + 1];

                arr[i + 1] = holder;

                holder = temp;
            }

            if (i == len - 1) {
                arr[0] = holder;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}