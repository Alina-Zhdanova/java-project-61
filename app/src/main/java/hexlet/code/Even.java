package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void even() {

        Scanner scanner = new Scanner(System.in);

        int correctAnswers = 0;  // счётчик правильных ответов
        int win = 3;  // необходимое количество правильных ответов для победы

        while (correctAnswers <= win) {

            Random random = new Random();  // тут генерируется рандомное число
            int randomNumber = random.nextInt (100);

            String answer;  // в этом кусочке проверяется, является ли рандомное число чётным, для проверки ответа пользователя
            if (randomNumber % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }

            // в этом блоке идёт взаимодействие с пользователем и получение его ответа
            System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion " + randomNumber + "\nYour answer: ");
            String answerUser = scanner.next();

            // что будет выдаваться в зависимости от правильности ответа, но нужно продумать выход из программы при неправильном ответе
            if (answer.equals(answerUser)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("\"" + answerUser + "\"" + " is wrong answer ;(. Correct answer was " + "\"" + answer + "\"" + "\nLet's try again, Bill!");
            }
        }
        scanner.close();
    }
}
