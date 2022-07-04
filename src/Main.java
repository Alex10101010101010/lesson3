public class Main {

    static int number = 0;

    public static void main(String[] args) {
        Fox fox = new Fox();
        fox.setSpeed(50);


        if (number >= 0) {
            System.out.println("Номер больше нуля или равно нулю");
        } else {
            System.out.println("Номер не равен нулю");
        }

        //Пример написания альтернативного кода (смотри выше)
        String alternative = number >= 0 ? "Номер больше нуля или равно нулю" : "Номер не равен нулю";
        System.out.println(alternative);

        long a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("ПРИВЕТ ! " + a++);
        }

        int f = 0;

        while (true) {
            System.out.println("ВЫВОДИМ ЧИСЛО - " + f++);
            if (f >= 5) {
                break;
            } else {
                System.out.println("Привет это Я");
            }
        }

        int first = 0;
        int second = 0;
        System.out.println(first == second);

        // при сравнении двух объектов с одинаковыми порамитрами они будут не равны (false), так как объекты созданы
        // в разных участках помяти,а сравнение осиществляется не значений оссылак на память.
        Fox foxy = new Fox();
        foxy.setSpeed(50);
        System.out.println(foxy == fox); // false - потому что это два разных объекта, они не могут быть одинаковы
        foxy = fox;// это два указателя которые указывают на один и тотже объект
        System.out.println(foxy == fox); //true
        System.out.println("\n должна быть скорость 50 - " + fox.getSpeed());
        foxy.setSpeed(100);
        System.out.println("\n должна быть скорость 100 - " + fox.getSpeed());
        foxy = new Fox();
        foxy.setSpeed(50);
        fox.setSpeed(50);
        System.out.println("\n сравнение значений у объектов true - " + fox.equals(foxy));//equals - сравнение значений у объектов

    }
}
