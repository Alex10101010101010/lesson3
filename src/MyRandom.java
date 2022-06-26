import java.util.Random;

public class MyRandom {

    private static final Random random = new Random();//создали экземпляр класса

    private static final int max = 3;//завели глобальную переменную
//    private static final int min = -100;//завели глобальную переменную

    //создали метод с вычислениями случайных сисел
    public int numbersRandom() {
        return random.nextInt(max);
    }
}
