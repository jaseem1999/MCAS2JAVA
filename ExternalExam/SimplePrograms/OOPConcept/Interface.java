package ExternalExam.SimplePrograms.OOPConcept;

public class Interface {
      public static void main(String[] args) {
        // Create instances of Car and Bicycle
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Call start and stop methods on both objects
        car.start();
        car.stop();

        bicycle.start();
        bicycle.stop();
    }
}
// Define an interface - Vehicle
interface Vehicle {
    void start(); // Abstract method to start the vehicle
    void stop();  // Abstract method to stop the vehicle
}

// Implement the interface in a class - Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

// Implement the interface in another class - Bicycle
class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }
}


