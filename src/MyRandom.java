import java.util.Random;

public class MyRandom {

    private static final Random random = new Random();//создали экземпляр класса

    private static final int max = 3;//завели глобальную переменную
//    private static final int min = -100;//завели глобальную переменную

    //создали метод с вычислениями случайных сисел
    public void numbersRandom() {
        //завели переменную и присвоили ей random значение (формула вычислений в диапазоне (max - min) + min)
        int result = random.nextInt(max);
        System.out.println(result);//вывили значение на консоль
    }
}
