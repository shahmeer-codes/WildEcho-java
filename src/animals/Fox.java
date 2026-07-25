package animals;

public class Fox extends Animal {

    public Fox() {
        super("Fox", "Forest", "Small Animals", 8, "Medium");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Ring-ding-ding!");
    }
}
