import java.util.Scanner;

public class Main {

    private static final Test test = new Test();
    private static int sum1 = 0;
    private static int sum2 = 0;

    public static void main(String[] args) {
        inputSum();

        test.method(sum1, sum2);
    }

    private static void inputSum() {
        Scanner console1 = new Scanner(System.in);
        System.out.print("введите первое число: ");
        sum1 = console1.nextInt();

        Scanner console2 = new Scanner(System.in);
        System.out.print("введите второе число: ");
        sum2 = console2.nextInt();
    }
}
