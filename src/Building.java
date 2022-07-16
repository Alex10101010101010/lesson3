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

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
