package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                Please enter the game number and press Enter.\

                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String userChoice = scanner.next();

        switch (userChoice) {
            case "1" -> Greet.greet();
            case "2" -> Even.play();
            case "3" -> Calc.play();
            case "4" -> GCD.play();
            case "5" -> Progression.play();
            case "6" -> Prime.play();
            case "0" -> {
                return;
            }
            default -> throw new Error("Unknown user choice: " + userChoice + "!");
        }

        scanner.close();

    }
}
