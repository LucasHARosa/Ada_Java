package mod1_aula3;

import java.util.Scanner;

public class Ex03_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arestas = new double[3];
        System.out.println("Digite os lados do triangulo");
        for (int i = 0; i < arestas.length; i++) {
            System.out.printf("lado %d: ", i+1);
            arestas[i] = scanner.nextDouble();
        }

        double area = calcularAreaTriangulo(arestas[0],arestas[1],arestas[2]);
        System.out.printf("A área é: %.2f",area);
    }

    public static double calcularAreaTriangulo(double lado1, double lado2, double lado3) {

        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = 0;
        try{
            if(verificaTriangulo(lado1,lado2,lado3)){
                area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
            }
        } catch ( LadosInvalidosException e){
            System.out.println(e.getMessage());
        }

        return area;
    }
    public static boolean verificaTriangulo (double lado1, double lado2, double lado3) throws LadosInvalidosException {
        boolean condicao1 = lado1 > Math.abs(lado2 - lado3) && lado1 < lado2 + lado3;
        boolean condicao2 = lado2 > Math.abs(lado1 - lado3) && lado2 < lado1 + lado3;
        boolean condicao3 = lado3 > Math.abs(lado1 - lado2) && lado3 < lado1 + lado2;
        if (!(lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1)){
            throw new LadosInvalidosException("Não forma triangulo");
        }
        return condicao1 && condicao2 && condicao3;
    }



}
