package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Greet;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit\nYour choice: ");
        String userChoice = scanner.next();

        if (userChoice.equals("1")) {
            Greet.greet();
        }

        if (userChoice.equals("2")) {
            Even.play();
        }

        if (userChoice.equals("3")) {
            Calc.calc();
        }

        scanner.close();

    }
}
