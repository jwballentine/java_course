import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();

        boolean pass = true;

        String direction = "";

        do {
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println(pass);
                break;
            }

            if (num > first && "".equals(direction)) {
                direction = "asc";
            } else if (num < first && "".equals(direction)) {
                direction = "dsc";
            }

            if (num > first && "dsc".equals(direction)) {
                pass = false;
            } else if (num < first && "asc".equals(direction)) {
                pass = false;
            }

            first = num;


        } while (scanner.hasNext());
    }
}