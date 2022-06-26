
public class Main {
    static MyRandom myRandom = new MyRandom();//создание экземпляра класса MyRandom
    static MyScanner myScanner = new MyScanner();//создание экземпляра класса MyScanner

    //это главный метод, где запускается программа
    public static void main(String[] args) {

        resultMethod();//Вызов метода
    }

    //невозвращаемый метод. Сравнивание загадонного числа и введенного через консоль числа
    private static void resultMethod() {

        while (true) {
            int numbersRandom = myRandom.numbersRandom();//создали переменную и инициализировали ее

            System.out.println("ПРОВЕРКА - Компьютер загадал число: " + numbersRandom);//это просто для проверки того, что компьютер загадал

            System.out.print("Компьютер загадал число от 0 до 3, угадай число: ");//Вывод в консоль

            int myNumberScanner = myScanner.myNumberScanner();//создали переменную и инициализировали ее

            if (numbersRandom == myNumberScanner) {//сравнение двух переменных (сравниваем числа)
                System.err.println("УРА Вы угодали, это число: " + numbersRandom);//Победа, выводим сообщение в консоль
                break;
            } else {
                //Проигрыш, выводим сообщение в консоль
                System.out.println("Вы не угадали, компьютер загадал число: " + numbersRandom + "\nПопробуйте еще раз!!!\n");
            }
        }
    }
}
