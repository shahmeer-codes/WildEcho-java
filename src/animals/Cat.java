package animals;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Meow!");
    }
}
