package animals;

public class Cat extends Animal {

    public Cat() {
        super("Cat", "House", "Fish", 15, "Low");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Meow!");
    }
}
