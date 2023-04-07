public class Main {
    public static void main(String[] args) {
        Building kamienica = new Building("Kamienica", 1946, 5);
        Building dom = new Building("Dom", 2002, 3);
        Building blok = new Building("Blok", 1989, 11);
        Building willa = new Building("Willa", 2009, 4);


        kamienica.displayBuildingInfo();
        System.out.println("Wiek kamienicy: " + kamienica.calculateBuildingAge() + " lat");

        dom.displayBuildingInfo();
        System.out.println("Wiek domu: " + dom.calculateBuildingAge() + " lat");

        blok.displayBuildingInfo();
        System.out.println("Wiek bloku: " + blok.calculateBuildingAge() + " lat");

        willa.displayBuildingInfo();
        System.out.println("Wiek willi: " + willa.calculateBuildingAge() + " lat");
    }
}
