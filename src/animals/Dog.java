package animals;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Woof! Woof!");
    }
}
