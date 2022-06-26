import java.util.Scanner;

/**
 * этот класс считывает введенное значения с консоли
 */

public class MyScanner {

    private final Scanner myNumber = new Scanner(System.in);//создание экземпляра класса Scanner

    //возвращаемый метод где присваиваем введенное значение с консоли переменной result
    public int myNumberScanner() {
        int result = myNumber.nextInt();
        return result;
    }
}
