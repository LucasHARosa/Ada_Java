package mod1_aula6;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;



public class Ex06_01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do produto: ");

        double valorProduto = scanner.nextDouble();

        scanner.close();
        double valorMG = valorProdutoFinal(valorProduto, State.MG);
        double valorRJ = valorProdutoFinal(valorProduto, State.RJ);
        double valorSP = valorProdutoFinal(valorProduto, State.SP);
        System.out.printf("O produto custa R$ %f em MG %n", valorMG);
        System.out.printf("O produto custa R$ %f em RJ %n", valorRJ);
        System.out.printf("O produto custa R$ %f em SP %n", valorSP);

    }
    public static double valorProdutoFinal(double valorProduto, State State) {
        return arredondar(valorProduto * (1.0 + State.getTax()));

    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}