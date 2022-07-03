public class Main {

    static int number = 0;
    public static void main(String[] args) {

        if (number > 0) {
            System.out.println("Номер больше нуля");
        } else if (number < 0) {
            System.out.println("Номер меньше нуля");
        } else {
            System.out.println("Номер равен нулю");
        }
    }
}
