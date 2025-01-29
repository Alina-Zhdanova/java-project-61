package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    public static String getTaskDescription() {
        return "What is the result of the expression?";
    }

    public static String[] getRandomTaskAndAnswer() {
        // пытаюсь сделать так, чтобы выдавался рандомный оператор с рандомными числами
        Random random = new Random();  // тут генерируется рандомное число
        final int upperLimit = 100;
        int randomNumberOne = random.nextInt(upperLimit);
        String[] operations = {"+", "-", "*"};
        var randomOperation = operations[random.nextInt(operations.length)];
        int randomNumberTwo = random.nextInt(upperLimit);
        String strRandomTask = randomNumberOne + " " + randomOperation + " " + randomNumberTwo;

        // проверяем, какой должен быть ответ и переводим его в строку для сравнения с ответом пользователя
        int result = switch (randomOperation) {
            case "+" -> randomNumberOne + randomNumberTwo;
            case "-" -> randomNumberOne - randomNumberTwo;
            case "*" -> randomNumberOne * randomNumberTwo;
            default -> throw new Error("Unknown random operation: " + randomOperation + "!");
        };
        String answer = String.valueOf(result);
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
