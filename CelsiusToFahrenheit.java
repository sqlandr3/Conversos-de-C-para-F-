import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Digite o temperatura em Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Celsius : " + celsius);
        System.out.println("Fahrenheit : " + fahrenheit);
        input.close();
    }
}