package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    public static void greet() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
