import java.util.Scanner;

public class MyScanner {

    private final Scanner myNumber = new Scanner(System.in);

    public int myNumberScanner() {
        System.out.print("Компьютер загадал число от 0 до 3, угодай число: ");
        return myNumber.nextInt();
    }
}
