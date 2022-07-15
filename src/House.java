/**
 * final class - от этого класса нельзя наследовоться
 */
public final class House extends Building implements Warm {

    int floor;

    @Override
    public void warm() {
        System.out.println("I am warn farm ............");
    }
}
