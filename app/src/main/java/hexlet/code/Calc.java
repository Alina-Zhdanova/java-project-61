package hexlet.code;

import java.util.Random;

public class Calc {
    public static void Calc() {

        // пытаюсь сделать так, чтобы выдавался рандомный символ
        Random random = new Random();  // тут генерируется рандомное число
        int randomNumberOne = random.nextInt (100);
        String[] operations = {"+", "-", "*"};
        var randomOperation = operations[random.nextInt(operations.length)];
        int randomNumberTwo = random.nextInt (100);

    }
}
