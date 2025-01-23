package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    public static String getTaskDescription() {
        return "What number is missing in the progression?";
    }

    public static String[] getRandomTaskAndAnswer() {

        // рандомим длину прогрессии
        Random random = new Random();
        int progressionLength = random.nextInt(5, 11);

        // создаём массив рандомной величины, которую определили ранее
        String[] fullProgression = new String[progressionLength];

        // определяем первое число прогрессии, вносим его в массив, определяем шаг прогрессии
        int nextNumberProgression = random.nextInt(100);
        String strNextNumberProgression = String.valueOf(nextNumberProgression);
        fullProgression[0] = strNextNumberProgression;
        int progressionStep = random.nextInt(1, 10);

        // в цикле заполняем массив числами с заданным шагом
        for (int i = 1; i < progressionLength; i++) {
            nextNumberProgression = nextNumberProgression + progressionStep;
            strNextNumberProgression = String.valueOf(nextNumberProgression);
            fullProgression[i] = strNextNumberProgression;
        }

        // рандомим позицию, которая должна замениться на ".." и заменяем,
        // предварительно сохранив значение для проверки ответа
        int change = random.nextInt(progressionLength);
        String answer = fullProgression[change];
        fullProgression[change] = "..";

        // выводим само задание строкой
        String strRandomTask = String.join(" ", fullProgression);
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
