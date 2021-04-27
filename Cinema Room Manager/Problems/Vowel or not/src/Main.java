import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here

        char lCh = Character.toLowerCase(ch);

        return lCh == 'a' || lCh == 'e' || lCh == 'i' || lCh == 'o' || lCh == 'u';

//        if (lCh == 'a' || lCh == 'e' || lCh == 'i' || lCh == 'o' || lCh == 'u') {
//            return true;
//        } else {
//            return false;
//        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}