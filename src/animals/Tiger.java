package animals;

public class Tiger extends Animal {

    public Tiger() {
        super("Tiger", "Jungle", "Meat", 20, "High");
    }

    @Override
    public void speak() {
        System.out.println("Sound        : Grrrr!");
    }
}
