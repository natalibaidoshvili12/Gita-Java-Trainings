package november29;

public class Main {

    public static void main(String[] args) {
        Building building = new Building(12, 36, 48);
        House house = new House(2, 5, 20, 4, 125.25);
        System.out.println(house);
        System.out.println(building);

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x + ", " + y + ", " + z);
    }

}
