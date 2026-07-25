package animals;

public class Elephant extends Animal {

    public Elephant() {
        super("Elephant");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Pawoo!");
    }
}
