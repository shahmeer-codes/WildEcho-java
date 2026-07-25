package animals;

public abstract class Animal {

    protected String name;
    protected String habitat;
    protected String food;
    protected int lifeSpan;
    protected String dangerLevel;

    public Animal(String name, String habitat, String food, int lifeSpan, String dangerLevel) {
        this.name = name;
        this.habitat = habitat;
        this.food = food;
        this.lifeSpan = lifeSpan;
        this.dangerLevel = dangerLevel;
    }

    public String getName() {
        return name;
    }

    public abstract void speak();

    public void showInfo() {
        System.out.println("Name         : " + name);
        System.out.println("Habitat      : " + habitat);
        System.out.println("Food         : " + food);
        System.out.println("Life Span    : " + lifeSpan + " years");
        System.out.println("Danger Level : " + dangerLevel);
    }
}
