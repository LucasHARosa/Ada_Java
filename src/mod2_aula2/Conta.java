package mod2_aula2;

public class Conta {
    Cliente cliente;
    String nConta;
    int saldo;

    public Conta(Cliente cliente, String nConta){
        this.cliente = cliente;
        this.nConta = nConta;
        this.saldo = 0;
    }

    public void Depositar(int valor){
        saldo += valor;
        System.out.println("Saldo atual da conta "+ nConta +" é R$"+saldo);
    }

    public void Sacar (int valor){
        if(saldo<valor){
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
        System.out.println("Saldo atual da conta "+ nConta +" é R$"+saldo);
    }

    @Override
    public boolean equals(Object c){
        if(c instanceof Conta conta){
            if(conta.nConta.equals(nConta)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return cliente.toString() + "; Numero da conta: "+ nConta+ "; Saldo R$: "+ String.valueOf(saldo);
    }
}
