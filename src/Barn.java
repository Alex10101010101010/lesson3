public class Barn extends Building implements Warm {

    public final String name;

    public Barn(String name) {
        this.name = name;
    }

    @Override
    public void warm() {
        System.out.println("I am warm barn ......." + name);

    }
}
