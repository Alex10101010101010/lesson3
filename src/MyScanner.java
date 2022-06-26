import java.util.Scanner;

public class MyScanner {

    private final Scanner myNumber = new Scanner(System.in);
    int result;
    public int myNumberScanner() {
        result = myNumber.nextInt();
        return result;
    }
}
