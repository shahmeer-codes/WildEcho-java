package animals;

public class Horse extends Animal {

    public Horse() {
        super("Horse");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Neigh!");
    }
}
