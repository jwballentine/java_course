import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        // write your code here
        boolean sorted = true;
        boolean sort = true;

        while (sort) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tempA = numbers[i];
                    int tempB = numbers[i + 1];

                    numbers[i] = tempB;
                    numbers[i + 1] = tempA;

                    sorted = false;

                }
            }

            if (sorted) {
                sort = false;
            }

            sorted = true;

        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}