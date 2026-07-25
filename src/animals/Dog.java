package animals;

public class Dog extends Animal {

    public Dog() {
        super("Dog", "House", "Meat", 13, "Low");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Woof! Woof!");
    }
}
