package mod4.aula3;

public class PrincipalCalcular {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Soma
        int somaResultado = calculadora.executar(10, 5, (a, b) -> a + b);
        System.out.println("Soma: " + somaResultado);

        // Subtração
        int subtracaoResultado = calculadora.executar(10, 5, (a, b) -> a - b);
        System.out.println("Subtração: " + subtracaoResultado);

        // Multiplicação
        int multiplicacaoResultado = calculadora.executar(10, 5, (a, b) -> a * b);
        System.out.println("Multiplicação: " + multiplicacaoResultado);

        // Divisão
        int divisaoResultado = calculadora.executar(10, 5, (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Divisão por zero");
            }
        });
        System.out.println("Divisão: " + divisaoResultado);
    }
}
