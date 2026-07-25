package animals;

public class Elephant extends Animal {

    public Elephant() {
        super("Elephant", "Forest", "Grass", 70, "Medium");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Pawoo!");
    }
}
