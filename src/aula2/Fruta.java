package aula2;

import java.util.Scanner;

public class Fruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] frutas = {"Pera","Laranja","Maca","Tomate","Caqui"};
        int[] quantidadeFrutas = new int[5];
        double valorPromocao = 1.25;
        double valorNormal = 1.45;
        double valorTotal=0;


        System.out.println("Bem vindo a feira. Para cada fruta coloque a quantidade desejada");
        for(int i = 0;i< frutas.length;i++){
            System.out.printf("%s: ",frutas[i]);
            quantidadeFrutas[i] = scanner.nextInt();
            if(quantidadeFrutas[i] > 10){
                valorTotal += valorPromocao * quantidadeFrutas[i];
            }
            else {
                valorTotal += valorNormal * quantidadeFrutas[i];
            }
        }

        System.out.printf("Valor total: %.2f",valorTotal);


    }
}
