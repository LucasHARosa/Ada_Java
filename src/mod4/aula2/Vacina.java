package mod4.aula2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Vacina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a data da primeira dose. formato (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        // Formato de data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Calcula a data após um mês
            LocalDate oneMonthLater = date.plusMonths(1);

            // Calcula a data após dois meses
            LocalDate twoMonthsLater = date.plusMonths(2);

            // Imprime as datas calculadas
            System.out.println("Data da segunda dose: " + oneMonthLater.format(formatter));
            System.out.println("Data da terceira dose: " + twoMonthsLater.format(formatter));
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de que está no formato dd-MM-yyyy.");
        }
    }
}
