package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc() {

        // узнаём имя пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;  // счётчик правильных ответов
        int win = 3;  // необходимое количество правильных ответов для победы

        while (correctAnswers < win) {

            // пытаюсь сделать так, чтобы выдавался рандомный оператор с рандомными числами
            Random random = new Random();  // тут генерируется рандомное число
            int randomNumberOne = random.nextInt(100);
            String[] operations = {"+", "-", "*"};
            var randomOperation = operations[random.nextInt(operations.length)];
            int randomNumberTwo = random.nextInt(100);
            var randomMathExpression = randomNumberOne + randomOperation + randomNumberTwo;

            // проверяем, какой должен быть ответ
            int result = switch (randomOperation) {
                case "+" -> randomNumberOne + randomNumberTwo;
                case "-" -> randomNumberOne - randomNumberTwo;
                case "*" -> randomNumberOne * randomNumberTwo;
                default -> 0;
            };

            // в этом блоке идёт взаимодействие с пользователем и получение его ответа
            System.out.print("Question: " + randomMathExpression + "\nYour answer: ");
            int answerUser = scanner.nextInt();

            // что будет выдаваться в зависимости от правильности ответа
            if (result == answerUser) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("\"" + answerUser + "\"" + " is wrong answer ;(. Correct answer was " + "\"" + result + "\"." + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        scanner.close();

        System.out.println("Congratulations, " + userName + "!");
    }
}
