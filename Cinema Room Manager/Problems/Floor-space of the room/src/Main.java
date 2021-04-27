import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();

        double answer = 0;

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                double temp = (a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c);
                answer = 0.25 * Math.pow(temp, 0.5);
                break;
            case "rectangle":
                double height = scanner.nextDouble();
                double width = scanner.nextDouble();

                answer = height * width;
                break;
            case "circle":
                double radius = scanner.nextDouble();
                answer = 3.14 * Math.pow(radius, 2);
                break;
            default:

        }

        System.out.println(answer);
    }
}