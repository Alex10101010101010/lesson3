public class Farm {

    Barn barn;
    House house = new House();

    public Farm(String name) {
        this.barn = new Barn(name);
    }

}
