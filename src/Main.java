import java.util.Random;

public class Main {

    static Random random = new Random();//создали экземпляр класса

    static int max = 100;//завели глобальную переменную
    static int min = -100;//завели глобальную переменную

    public static void main(String[] args) {

        numbersRandom();//вызвали метод
    }

    //создали метод с вычислениями случайных сисел
    private static void numbersRandom() {
        //завели переменную и присвоили ей random значение (формула вычислений в диапазоне (max - min) + min)
        int result = random.nextInt(max - min) + min;
        System.out.println(result);//вывили значение на консоль
    }
}
