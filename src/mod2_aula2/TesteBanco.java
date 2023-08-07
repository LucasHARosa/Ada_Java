package mod2_aula2;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        Banco banco = new Banco();
        String numeroConta = "";
        int valor =0;
        System.out.println("Bem vindo ao banco!");
        do {
            System.out.println("");
            System.out.printf("Selecione sua opção:%n0- Sair%n1- Criar conta%n2- Depositar em uma conta%n3- Sacar valor em uma conta%n4- Mostra uma conta%n");
            numero = scanner.nextInt();
            scanner.nextLine();
            switch (numero){
                case 1:
                    banco.AddConta();
                    break;
                case 2:
                    System.out.println("Depositar: Digite o numero da conta:");
                    numeroConta = scanner.nextLine();
                    System.out.println("Digite o valor a ser depositado na conta:");
                    valor = scanner.nextInt();
                    scanner.nextLine();
                    banco.Depositar(numeroConta,valor);
                    break;
                case 3:
                    System.out.println("Sacar: Digite o numero da conta:");
                    numeroConta = scanner.nextLine();
                    System.out.println("Digite o valor a ser sacado na conta:");
                    valor = scanner.nextInt();
                    scanner.nextLine();
                    banco.Sacar(numeroConta,valor);
                    break;
                case 4:
                    System.out.println("Ver: Digite o numero da conta:");
                    numeroConta = scanner.nextLine();
                    Conta conta = banco.BuscarConta(numeroConta);
                    if(conta!=null){
                        System.out.println(conta.toString());
                    }
                    break;
            }

        } while (numero != 0);

    }
}
