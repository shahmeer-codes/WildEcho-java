package animals;

public class Lion extends Animal {

    public Lion() {
        super("Lion", "Savanna", "Meat", 18, "High");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Roar!");
    }
}
