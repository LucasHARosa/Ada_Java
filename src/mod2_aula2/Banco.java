package mod2_aula2;

import java.util.Scanner;

public class Banco {
    Conta[] contas;

    public Banco(){

    }

    public void AddConta(){
        String nome;
        String cpf;
        String email;
        String nConta;
        Conta[] novaLista;
        if(contas != null){
            nConta = String.valueOf(contas.length +1);
            novaLista = new Conta[contas.length + 1];
            for (int i = 0; i < contas.length; i++) {
                novaLista[i] = contas[i];
            }
        }
        else{
            nConta = "1";
            novaLista = new Conta[1];
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = scanner.nextLine();
        System.out.println("Digite o cpf:");
        cpf = scanner.nextLine();
        System.out.println("Digite o email:");
        email = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome,cpf,email);
        Conta novaConta = new Conta(novoCliente,nConta);


        novaLista[novaLista.length-1] = novaConta;
        contas = novaLista;
        System.out.println("O numero da sua conta é: " + nConta);

    }

    public Conta BuscarConta(String nConta){
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].nConta.equals(nConta)) {
                return contas[i];
            }
        }
        System.out.println("Conta não existe");
        return null;
    }

    public void Depositar(String nConta, int valor){
        Conta contaDestino = BuscarConta(nConta);
        if(contaDestino != null) {
            contaDestino.Depositar(valor);
        }
    }
    public void Sacar(String nConta, int valor){
        Conta contaDestino = BuscarConta(nConta);
        if(contaDestino != null){
            contaDestino.Sacar(valor);
        }
    }

}
