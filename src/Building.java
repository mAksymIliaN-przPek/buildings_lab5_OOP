import java.time.LocalDate;

public class Building {
    private String name;
    private int yearBuilt;
    private int numberOfFloors;
    public Building(String name, int yearBuilt, int numberOfFloors) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.numberOfFloors = numberOfFloors;
    }
    public void displayBuildingInfo() {
        System.out.println("Nazwa budynku: " + name);
        System.out.println("Rok budowy: " + yearBuilt);
        System.out.println("Liczba pięter: " + numberOfFloors);
    }

    public int calculateBuildingAge() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - yearBuilt;
        return age;
    }
}