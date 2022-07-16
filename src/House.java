/**
 * final class - от этого класса нельзя наследовоться
 */
public final class House extends Building implements Warm {

    int floor;

    //перегрузка конструктора
    public House(int height, int width, int floor) {
        super(height, width);
        this.floor = floor;
    }

    @Override
    public void warm() {
        System.out.println("I am warn farm ............");
    }
}
