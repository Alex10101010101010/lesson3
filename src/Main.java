public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm("Barn");

        System.out.println(farm.barn.isHasRoof());
        System.out.println(farm.barn.getHeight());

        farm.house.setColor("Green");
        System.out.println(farm.house.getColor());

    }
}
