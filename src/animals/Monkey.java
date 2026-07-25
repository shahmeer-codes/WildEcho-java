
package animals;

public class Monkey extends Animal {

    public Monkey() {
        super("Monkey");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Oo oo aa aa!");
    }
}
