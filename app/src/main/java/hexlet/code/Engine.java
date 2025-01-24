package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String taskDescription, String[][] randomTasksAndAnswers) {

        Scanner scanner = new Scanner(System.in);

        // узнаём имя пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(taskDescription);

        int correctAnswers = 0;  // счётчик правильных ответов
        final int win = 3;  // необходимое количество правильных ответов для победы

        while (correctAnswers < win) {

            String randomTask = randomTasksAndAnswers[correctAnswers][0];
            String answer = randomTasksAndAnswers[correctAnswers][1];

            // в этом блоке идёт взаимодействие с пользователем и получение его ответа
            System.out.print("Question: " + randomTask + "\nYour answer: ");
            String answerUser = scanner.next();

            // что будет выдаваться в зависимости от правильности ответа
            if (answer.equals(answerUser)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("\"" + answerUser + "\"" + " is wrong answer ;(. Correct answer was " + "\""
                        + answer + "\"." + "\nLet's try again, " + userName + "!");
                return;
            }
        }
        scanner.close();

        System.out.println("Congratulations, " + userName + "!");
    }
}
