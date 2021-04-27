package cinema;

import java.util.Scanner;

public class Cinema {
    public static String[][] twoArr;
    public static int rows;
    public static int seats;
    public static int numTickets = 0;
    public static int totalSeats;
    public static int currentIncome;
    public static int totalIncome;

    public static void main(String[] args) {
        // Write your code here
//        System.out.println("Cinema:");
//        System.out.println("  1 2 3 4 5 6 7 8");
//        System.out.println("1 S S S S S S S S");
//        System.out.println("2 S S S S S S S S");
//        System.out.println("3 S S S S S S S S");
//        System.out.println("4 S S S S S S S S");
//        System.out.println("5 S S S S S S S S");
//        System.out.println("6 S S S S S S S S");
//        System.out.println("7 S S S S S S S S");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();
//        System.out.println("Total income:");

        if (rows * seats <= 60) {
            totalIncome = rows * seats * 10;
        } else {
            int half = rows / 2;
            int backHalf = rows - half;

            totalIncome = half * seats * 10 + backHalf * seats * 8;
        }

        totalSeats = rows * seats;
        twoArr = new String[rows + 1][seats + 1];

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if (i == 0){
                    if (j == 0) {
                        twoArr[i][j] = " ";
                    } else {
                        twoArr[i][j] = String.valueOf(j);
                    }
                } else {
                    if (j == 0) {
                        twoArr[i][j] = String.valueOf(i);
                    } else {
                        twoArr[i][j] = "S";
                    }
                }
            }
        }

        menu();



//        System.out.println("Cinema:");
//
//        for (int i = 0; i < rows + 1; i++) {
//            for (int j = 0; j < seats + 1; j++) {
//                if (j == seats) {
//                    System.out.println(twoArr[i][j]);
//                } else {
//                    System.out.print(twoArr[i][j] + " ");
//                }
//            }
//        }

    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                break;
            case 1:
                showSeats();
                break;
            case 2:
                buyTicket();
                break;
            case 3:
                showStats();
                break;
            default:
                return;

        }

    }

    public static void showSeats(){
        System.out.println("Cinema:");

        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < seats + 1; j++) {
                if (j == seats) {
                    System.out.println(twoArr[i][j]);
                } else {
                    System.out.print(twoArr[i][j] + " ");
                }
            }
        }

        menu();
    }

    public static void buyTicket(){
        Scanner scanner = new Scanner(System.in);

        boolean seatsTaken = true;

        int rowNum = 0;
        int seatNum = 0;

        while (seatsTaken) {
            System.out.println("Enter a row number:");
            rowNum = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNum = scanner.nextInt();

            if (rowNum <= rows && rowNum >= 0 && seatNum <= seats && seatNum >= 0) {
                if (twoArr[rowNum][seatNum] == "S") {
                    seatsTaken = false;
                } else {
                    System.out.println("That ticket has already been purchased!");
                }
            } else {
                System.out.println("Wrong input!");
            }

        }

        System.out.print("Ticket price: ");

        int ticketPrice;

        if (rows * seats <= 60) {
            ticketPrice = 10;
        } else {
            if (rowNum <= rows/2) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }

        System.out.println("$" + ticketPrice);

        twoArr[rowNum][seatNum] = "B";

        numTickets++;

        currentIncome += ticketPrice;

        menu();
    }

    public static void showStats() {
        double sold = numTickets;
        double tot = totalSeats;

        double percent = (sold / tot) * 100;

        System.out.printf("Number of purchased tickets: %d\n", numTickets);
        System.out.printf("Percentage: %.2f", percent);
        System.out.print("%");
        System.out.println();
        System.out.printf("Current income: $%d\n", currentIncome);
        System.out.printf("Total income: $%d\n", totalIncome);

        menu();
    }
}