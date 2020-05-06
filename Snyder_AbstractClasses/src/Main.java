import java.util.ArrayList;

/**
 * Demonstrate the use of abstract classes
 * @Author  Ian Snyder
 *
 * Do the following steps:
 *
 * XStep 0: Add YOUR NAME above
 *
 * Step 1: Run the code and notice how it works
 *
 * Step 2:  For our purposes, the Animal class is abstract, high-level idea that should not be used to create objects.
 * Make the class and abstract class
 *
 * Step 3:  Notice how our animalSound method in class Animal doesn't make sense.  What animal makes a default sound?
 * Make this method abstract, forcing all derived classes to implement it but leaving it unimplemented in the base/Animal class
 *
 * Step 4: Run it. Does everything still work?
 *
 * Step 5: Add another Animal subclass of your choice.  Remember it MUST implemenent all abstract methods in its parent class.
 * What does the fox say?
 *
 * Step 6: Instantiate a new animal using your new class and add it to your zoo.  Run it. Does everything work?
 * Notice how any subclass that you create and add to your zoo will not break your zoo code!
 *
 */

abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println(getClass().getName() + " is catching some Zzz's. Let' all envy " + getClass().getName());
    }
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println(getClass().getName() + " says: wee wee");
    }
}

class Wolf extends Animal{
    @Override
    public void animalSound() {
        System.out.println(getClass().getName() + " says: I'ma blow your house down piggy.");
    }

    public void howling() {
        System.out.println(getClass().getName() + " is now howling with the pack");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Pig());
        zoo.add(new Wolf());
        for (Animal animal: zoo) {
            animal.animalSound();
            animal.sleep();
        }
    }
}
