package aula6;
import java.util.Arrays;
public class Ex06_05 {
    public static String avaliacao(double[] input) {
        Arrays.sort(input);
        int n = input.length/2;
        double total = 0;
        double desconto = 0;
        for(double na:input){
            total += na;
        }
        for(int i = 0;i<n;i++){
            desconto += input[i]/2;
        }
        double totalDesconto = total - desconto;
        String resultado = String.format("Valor total: %.1f | Valor de descontos: %.1f | Valor a pagar: %.1f", total,
                desconto, totalDesconto);
        return resultado;
    }
}
