package animals;

public class Wolf extends Animal {

    public Wolf() {
        super("Wolf");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Awoooo!");
    }
}
