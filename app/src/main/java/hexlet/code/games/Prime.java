package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static String getTaskDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[] getRandomTaskAndAnswer() {

        // генерируем рандомное число
        Random random = new Random();
        int lowerLimit = 2;
        int upperLimit = 100;
        int randomTask = random.nextInt(lowerLimit, upperLimit);
        String strRandomTask = String.valueOf(randomTask);

        // проверяем, является ли оно простым

        String answer = "";

        for (int divider = 2; divider <= randomTask / 2; divider++) {
            if (randomTask % divider != 0) {
                answer = "yes";
            } else {
                answer = "no";
                break;
            }
        }
        return new String[]{strRandomTask, answer};
    }

    public static String[][] getRandomTasksAndAnswers() {
        int amount = 3;
        String[][] randomTasksAndAnswers = new String[amount][2];
        for (int i = 0; i < amount; i++) {
            String[] randomTaskAndAnswer = getRandomTaskAndAnswer();
            randomTasksAndAnswers[i] = randomTaskAndAnswer;
        }
        return randomTasksAndAnswers;
    }

    public static void play() {
        String taskDescription = getTaskDescription();
        String[][] randomTasksAndAnswers = getRandomTasksAndAnswers();
        Engine.engine(taskDescription, randomTasksAndAnswers);
    }
}
