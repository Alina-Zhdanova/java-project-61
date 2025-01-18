package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String taskDescription, String[][] RandomTasksAndAnswers) {

            Scanner scanner = new Scanner(System.in);

            // узнаём имя пользователя
            System.out.print("May I have your name? ");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            System.out.println(taskDescription);

            int correctAnswers = 0;  // счётчик правильных ответов
            int win = 3;  // необходимое количество правильных ответов для победы

            while (correctAnswers < win) {

                String randomTask = RandomTasksAndAnswers[correctAnswers][0];
                String answer = RandomTasksAndAnswers[correctAnswers][1];

                // в этом блоке идёт взаимодействие с пользователем и получение его ответа
                System.out.print("Question: " + randomTask + "\nYour answer: ");
                String answerUser = scanner.next();

                // что будет выдаваться в зависимости от правильности ответа
                if (answer.equals(answerUser)) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("\"" + answerUser + "\"" + " is wrong answer ;(. Correct answer was " + "\"" + answer + "\"." + "\nLet's try again, " + userName + "!");
                    return;
                }
            }
            scanner.close();

            System.out.println("Congratulations, " + userName + "!");
        }
    }
