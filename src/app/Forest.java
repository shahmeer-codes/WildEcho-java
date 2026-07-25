package app;

import java.util.Scanner;

import animals.*;

public class Forest {

    private final Scanner input = new Scanner(System.in);

    public void start() {

        boolean running = true;

        System.out.println("=================================");
        System.out.println("      Welcome to WildEcho");
        System.out.println("=================================");

        while (running) {

            showMenu();

            System.out.print("\nChoose an animal: ");

            if (!input.hasNextInt()) {
                System.out.println("\nInvalid input! Please enter a number.");
                input.next();
                continue;
            }

            int choice = input.nextInt();

            Animal animal = null;

            switch (choice) {

                case 1:
                    animal = new Cat();
                    break;

                case 2:
                    animal = new Dog();
                    break;

                case 3:
                    animal = new Lion();
                    break;

                case 4:
                    animal = new Tiger();
                    break;

                case 5:
                    animal = new Elephant();
                    break;

                case 6:
                    animal = new Horse();
                    break;

                case 7:
                    animal = new Wolf();
                    break;

                case 8:
                    animal = new Fox();
                    break;

                case 9:
                    animal = new Monkey();
                    break;

                case 0:
                    running = false;
                    System.out.println("\nThank you for visiting WildEcho!");
                    continue;

                default:
                    System.out.println("\nInvalid choice.");
                    continue;
            }

            System.out.println("\n------------------------------");
            System.out.println("You selected: " + animal.getName());
            animal.showInfo();
            System.out.println();
            animal.speak();
            animal.eat();
            animal.move();
            System.out.println("------------------------------");

            System.out.print("\nDo you want to choose another animal? (y/n): ");
            char again = input.next().toLowerCase().charAt(0);

            if (again != 'y') {
                running = false;
                System.out.println("\nThank you for visiting WildEcho!");
            }
        }

        input.close();
    }

    private void showMenu() {

        System.out.println("\n========= Animals =========");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Lion");
        System.out.println("4. Tiger");
        System.out.println("5. Elephant");
        System.out.println("6. Horse");
        System.out.println("7. Wolf");
        System.out.println("8. Fox");
        System.out.println("9. Monkey");
        System.out.println("0. Exit");
    }
}
