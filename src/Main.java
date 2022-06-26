
public class Main {

    static MyRandom myRandom = new MyRandom();
    static MyScanner myScanner = new MyScanner();
    static int numbersRandom = myRandom.numbersRandom();

    public static void main(String[] args) {

        System.out.println("ПРОВЕРКА - Компьютер загадал число: " + numbersRandom);

        resultMethod();
    }

    private static void resultMethod() {

        System.out.print("Компьютер загадал число от 0 до 3, угодай число: ");

        int myNumberScanner = myScanner.myNumberScanner();

        if (numbersRandom == myNumberScanner) {
            System.err.println("УРА Вы угодали, это число: " + numbersRandom);
        } else {
            System.out.println("Вы не угодали, компьютер загодал число: " + numbersRandom + "\nПопробуйте в другой раз!!");
        }
    }
}
