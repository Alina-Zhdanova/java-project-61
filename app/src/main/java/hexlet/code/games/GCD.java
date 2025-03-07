package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {

    public static String getTaskDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[] getRandomTaskAndAnswer() {

        Random random = new Random();  // тут генерируются рандомные числа
        final int lowerLimit = 1;
        final int upperLimit = 100;
        int randomNumberOne = random.nextInt(lowerLimit, upperLimit);
        int randomNumberTwo = random.nextInt(lowerLimit, upperLimit);
        String strRandomTask = randomNumberOne + " " + randomNumberTwo;

        // находи НОД для проверки ответа пользователя
        int largerNumber;
        int smallerNumber;
        int remainder = 1;
        int greatestCommonDivisor;
        String answer = "";
        if (randomNumberOne > randomNumberTwo) {
            largerNumber = randomNumberOne;
            smallerNumber = randomNumberTwo;
        } else {
            largerNumber = randomNumberTwo;
            smallerNumber = randomNumberOne;
        }
        while (remainder != 0) {  // 48 & 18
            remainder = largerNumber % smallerNumber; // остаток = 12   остаток = 6   остаток = 0
            largerNumber = smallerNumber; // большее = 18   большее = 12   большее = 6
            smallerNumber = remainder; // меньшее = 12   меньшее = 6   меньшее = 0
            greatestCommonDivisor = largerNumber;
            answer = String.valueOf(greatestCommonDivisor);
        }
        return new String[]{strRandomTask, answer};
    }

    public static String[][] getRandomTasksAndAnswers(int amount) {
        String[][] randomTasksAndAnswers = new String[amount][2];
        for (int i = 0; i < amount; i++) {
            String[] randomTaskAndAnswer = getRandomTaskAndAnswer();
            randomTasksAndAnswers[i] = randomTaskAndAnswer;
        }
        return randomTasksAndAnswers;
    }

    public static void play() {
        final int tasksAmount = 3;
        String taskDescription = getTaskDescription();
        String[][] randomTasksAndAnswers = getRandomTasksAndAnswers(tasksAmount);
        Engine.engine(taskDescription, randomTasksAndAnswers);
    }
}
