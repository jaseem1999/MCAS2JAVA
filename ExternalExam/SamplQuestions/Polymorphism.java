//Using the concept of polymorphism write a program add two numbers and concatenate two string using appropriate exception 

package ExternalExam.SamplQuestions;

// Custom exception for handling invalid operations
class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

// Base class for performing operations
class Operation {
    public void performOperation() throws InvalidOperationException {
        // Default implementation (no operation)
    }
}

// Subclass for adding two numbers
class AdditionOperation extends Operation {
    private double num1;
    private double num2;

    public AdditionOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void performOperation() {
        double result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }
}

// Subclass for concatenating two strings
class ConcatenationOperation extends Operation {
    private String str1;
    private String str2;

    public ConcatenationOperation(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public void performOperation() {
        String result = str1 + str2;
        System.out.println("Concatenation Result: " + result);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        try {
            // Create an instance of AdditionOperation
            Operation addition = new AdditionOperation(5.0, 3.0);
            
            // Perform addition
            addition.performOperation();
            
            // Create an instance of ConcatenationOperation
            Operation concatenation = new ConcatenationOperation("Hello, ", "World!");
            
            // Perform concatenation
            concatenation.performOperation();
        } catch (InvalidOperationException e) {
            System.err.println("Invalid operation: " + e.getMessage());
        }
    }
}
