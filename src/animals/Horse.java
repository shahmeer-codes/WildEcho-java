package animals;

public class Horse extends Animal {

    public Horse() {
        super("Horse", "Grassland", "Grass", 30, "Low");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Neigh!");
    }
}
