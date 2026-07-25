package animals;

public class Wolf extends Animal {

    public Wolf() {
        super("Wolf", "Forest", "Meat", 14, "High");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Awoooo!");
    }
}
