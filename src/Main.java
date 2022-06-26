import java.util.Scanner;

public class Main {

    private static final Test test = new Test();//создание экземпляра класса
    private static int sum1 = 0;//это глобальная переменная
    private static int sum2 = 0;//это глобальная переменная

    public static void main(String[] args) {

        inputSum();

        test.method(sum1, sum2);
    }

    //делаем запрос на ввод чисел и присваиваем переменным значения
    private static void inputSum() {
        Scanner console1 = new Scanner(System.in);//создаем экземпляр класса (создаем переменную Scanner - работа с вводом из консоли)
        System.out.print("введите первое число: ");//выводим сообщение на консоль
        sum1 = console1.nextInt();//присваиваем переменной введенное значение с консоли

        Scanner console2 = new Scanner(System.in);
        System.out.print("введите второе число: ");
        sum2 = console2.nextInt();
    }
}
