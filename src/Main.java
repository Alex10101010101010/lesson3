
public class Main {

    static MyRandom myRandom = new MyRandom();//создание экземпляра класса MyRandom
    static MyScanner myScanner = new MyScanner();//создание экземпляра класса MyScanner
    static int numbersRandom = myRandom.numbersRandom();//создали переменную и инициализировали ее

    //это главный метод где запускается программа
    public static void main(String[] args) {

        System.out.println("ПРОВЕРКА - Компьютер загадал число: " + numbersRandom);//это просто для проверки того, что компьютер загадал

        resultMethod();//Вызов метода
    }

    //не возвращаемый метод. Сравивание загадонного числа с введенным через консоль числом
    private static void resultMethod() {

        System.out.print("Компьютер загадал число от 0 до 3, угодай число: ");//Вывод в консоль

        int myNumberScanner = myScanner.myNumberScanner();//создали переменную и инициализировали ее

        //
        if (numbersRandom == myNumberScanner) {//сравнение двух переменных (сравниваем числа)
            System.err.println("УРА Вы угодали, это число: " + numbersRandom);//Победа, выводим сообщение в консоль
        } else {
            //Проигрыш, выводим сообщение в консоль
            System.out.println("Вы не угодали, компьютер загодал число: " + numbersRandom + "\nПопробуйте в другой раз!!");
        }
    }
}
