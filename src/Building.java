/**
 * abstract class - у этого  класса не льзя создать экземпльр класс !
 */
public abstract class Building {

    private final boolean hasRoof = true;
    private int height;
    private int width;
    private String color;

    public boolean isHasRoof() {
        return hasRoof;
    }

    public int getHeight() {
        return height;
    }
}
