
public class Main {

    static MyRandom myRandom = new MyRandom();
    static MyScanner myScanner = new MyScanner();

    public static void main(String[] args) {

        myRandom.numbersRandom();//вызвали метод

        System.out.println(myScanner.myNumberScanner());
    }

}
