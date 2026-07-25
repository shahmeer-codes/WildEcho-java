
package animals;

public class Tiger extends Animal {

    public Tiger() {
        super("Tiger");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Grrrr!");
    }
}
