package mod1.mod1_aula1;
import java.util.Scanner;

public class Ex01_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite Ex07_LMS02 temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);

        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);

        scanner.close();

    }
}
