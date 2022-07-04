public class Main {

    static int number = 0;

    public static void main(String[] args) {

        if (number >= 0) {
            System.out.println("Номер больше нуля или равно нулю");
        } else {
            System.out.println("Номер не равен нулю");
        }

        //Пример написания альтернативного кода (смотри выше)
        String alternative = number >= 0 ? "Номер больше нуля или равно нулю" : "Номер не равен нулю";
        System.out.println(alternative);

        for (int i = 30; i < 50; i++) {
            System.out.println("ПРИВЕТ ! " + i);
        }
    }
}
