public class Barn extends Building implements Warm {

    public final String name;

    public Barn(int height, int width, String name) {
        super(height, width);
        this.name = name;
    }

    @Override
    public void warm() {
        System.out.println("I am warm barn ......." + name);

    }
}
