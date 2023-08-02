package mod1_aula3;

public class Ex03_02 {
    public static double[] custosCarro( double[] input) {
        double[] saida = new double[2];
        double valorFinal = input[0];
        double distribuidor = input[1];
        double imposto = input[2];
        distribuidor = Math.round((distribuidor/valorFinal)*10000);
        imposto = Math.round((imposto/valorFinal)*10000);
        saida[0] = distribuidor/100;
        saida[1] = imposto/100;
        return saida;
    }

}
