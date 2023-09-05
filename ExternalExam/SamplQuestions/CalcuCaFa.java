//Create a package “TEMPERATURE” . within it should have an interface with an prototype calculate. 
//And two classes Fahrenheit and celsius . find the values for N numbers
//[ FORMULA (32°F − 32) × 5/9 = 0°C]


package ExternalExam.SamplQuestions;

import java.util.Scanner;

interface TemperatureConverter {
    double calculate(double value);
}

class Fahrenheit implements TemperatureConverter {
    public double calculate(double value) {
        return (value - 32) * 5/9;
    }
}

class Celsius implements TemperatureConverter {
    public double calculate(double value) {
        return (value * 9/5) + 32;
    }
}


public class CalcuCaFa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of temperatures: ");
        double temperature = scanner.nextDouble();
        TemperatureConverter converterCelsius = new Celsius();
         System.out.println("Celsius: " + converterCelsius.calculate(temperature));
        TemperatureConverter converterFahrenheit = new Fahrenheit();
        System.out.println("Fahrenheit: " + converterFahrenheit.calculate(temperature));
        scanner.close();
    }
}
