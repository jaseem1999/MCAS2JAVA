package ExternalExam.SimplePrograms.OOPConcept;
// Abstract class - Animal
abstract class Animal {
    // Abstract method - must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Concrete subclass - Dog
class Dog extends Animal {
  
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Concrete subclass - Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Absraction {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call makeSound method on both objects
        dog.makeSound();
        cat.makeSound();

        // Call the eat method on both objects
        dog.eat();
        cat.eat();
    }    
}
