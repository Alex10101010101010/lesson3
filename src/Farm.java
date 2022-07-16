public class Farm {

    Barn barn;
    House house = new House(10, 10, 100);

    public Farm(String name) {
        this.barn = new Barn(11, 15, name);
    }

}
