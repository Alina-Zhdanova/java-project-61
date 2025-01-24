package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static String getTaskDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[] getRandomTaskAndAnswer() {
        Random random = new Random();
        final int upperLimit = 100;
        int randomTask = random.nextInt(upperLimit);
        String strRandomTask = String.valueOf(randomTask);

        String answer;
        if (randomTask % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[]{strRandomTask, answer};
    }

    public static String[][] getRandomTasksAndAnswers() {
        final int amount = 3;
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

