package aula5;

import java.util.Scanner;

public class Ex05_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] frutas = {"Pera","Laranja","Maca","Tomate","Caqui"};
        double[] quantidadeFrutas = new double[5];
        double valorPromocao = 1.25;
        double valorNormal = 1.45;
        double valorTotal=0;


        System.out.println("Bem vindo Ex07_LMS02 feira. Para cada fruta coloque Ex07_LMS02 quantidade desejada");
        for(int i = 0;i< frutas.length;i++){
            System.out.printf("%s: ",frutas[i]);
            quantidadeFrutas[i] = scanner.nextDouble();
            try{
                ehZero(quantidadeFrutas[i]);
            }catch (EhzeroException e){
                System.out.println(e.getMessage());
            }

            try{
                ehNegativo(quantidadeFrutas[i]);
            }catch (EhNegativoException e){
                System.out.println(e.getMessage());
            }


            if(quantidadeFrutas[i] > 10){
                valorTotal += valorPromocao * quantidadeFrutas[i];
            }
            else {
                valorTotal += valorNormal * quantidadeFrutas[i];
            }
        }
        System.out.printf("Valor total: %.2f",valorTotal);


    }
    public static double custoCompra(double input) {
        double valorPromocao = 1.25;
        double valorNormal = 1.45;
        double valorTotal=0;
        if(input>10){
            valorTotal = input*valorPromocao;
        }
        else{
            valorTotal = input*valorNormal;
        }
        return valorTotal;
    }

    public static void ehZero(double input) throws EhzeroException {
        if(input == 0){
            throw new EhzeroException("não é possivel realizar um pedido sem itens");
        }
    }

    public static void ehNegativo(double input) throws EhNegativoException {
        if(input < 0){
            throw new EhNegativoException("Esse formato de número não é valido");
        }
    }
}
