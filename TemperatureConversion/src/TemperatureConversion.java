import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //variable declarations
        double tempFahrenheit;
        double tempCelsius;
        double tempKelvin;

        //initializing scanner to read in from keyboard
        Scanner in = new Scanner(System.in);
        //output text to screen asking the user to enter a temperature
        System.out.print("Please enter a Temperature in Fahrenheit: ");
        //variables initialized
        tempFahrenheit = in.nextDouble(); //stored input data from keyboard as double
        tempCelsius = ((tempFahrenheit - 32) * (5.0 / 9.0)); //expression
        tempKelvin = tempCelsius + 273.15; //expression
        //outputting text to the screen with converted temperature information
        System.out.printf("The converted temperature in Celsius is: %.1f", tempCelsius); //printf to round temp result
        System.out.println("\u00b0C"); //prints degree symbol and C
        System.out.printf("The converted temperature in Kelvin is: %.1f", tempKelvin); //printf to round temp result
        System.out.println("\u00b0K"); //prints degree symbol and C
    }
}
