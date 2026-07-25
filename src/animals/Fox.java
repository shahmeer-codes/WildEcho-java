
package animals;

public class Fox extends Animal {

    public Fox() {
        super("Fox");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Ring-ding-ding!");
    }
}
