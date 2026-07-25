package animals;

public class Monkey extends Animal {

    public Monkey() {
        super("Monkey", "Jungle", "Fruits", 25, "Low");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Oo oo aa aa!");
    }
}
