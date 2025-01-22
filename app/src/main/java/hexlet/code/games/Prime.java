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
        int randomTask = random.nextInt(2, 100);
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
        String[][] RandomTasksAndAnswers = new String[amount][2];
        for (int i = 0; i < amount; i++) {
            String[] randomTaskAndAnswer = getRandomTaskAndAnswer();
            RandomTasksAndAnswers[i] = randomTaskAndAnswer;
        }
        return RandomTasksAndAnswers;
    }

    public static void play() {
        String taskDescription = getTaskDescription();
        String[][] RandomTasksAndAnswers = getRandomTasksAndAnswers();
        Engine.engine(taskDescription, RandomTasksAndAnswers);
    }
}
