package animals;

public class Lion extends Animal {

    public Lion() {
        super("Lion");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Roar!");
    }
}
