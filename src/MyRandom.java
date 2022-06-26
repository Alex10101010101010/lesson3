import java.util.Random;

/**
 * этот класс генерирует случайные числа
 */

public class MyRandom {

    private static final Random random = new Random();//создали экземпляр класса

    private static final int MAX = 3;//завели глобальную переменную (это константа)
//    private static final int min = -100;//завели глобальную переменную

    //создали возвращаемый метод случайных чисел
    public int numbersRandom() {
        return random.nextInt(MAX);
    }
}
