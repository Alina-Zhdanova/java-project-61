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
        int randomNumberOne = random.nextInt(100);
        String[] operations = {"+", "-", "*"};
        var randomOperation = operations[random.nextInt(operations.length)];
        int randomNumberTwo = random.nextInt(100);
        String strRandomTask = randomNumberOne + randomOperation + randomNumberTwo;

        // проверяем, какой должен быть ответ и переводим его в строку для сравнения с ответом пользователя
        int result = switch (randomOperation) {
            case "+" -> randomNumberOne + randomNumberTwo;
            case "-" -> randomNumberOne - randomNumberTwo;
            case "*" -> randomNumberOne * randomNumberTwo;
            default -> 0;
        };
        String answer = String.valueOf(result);
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
