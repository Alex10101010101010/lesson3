public class Test {
    int result = 0;//это глобальная переменная

    public int method(int a, int b) {

        System.err.println("Мы сложили Ваши числа и получили: " + result);// вавили результат на экран

        return result = a + b;//это возврат значения (одновременно мы сдесь сделали вычисление)
    }
}
