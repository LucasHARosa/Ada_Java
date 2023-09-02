package mod3.aula1;

public class Pix implements Transferenciabancaria {
@Override
    public void transferir(String contaOrigem, String contaDestino, double valor) {
        System.out.println("transferindo");
    }
}
