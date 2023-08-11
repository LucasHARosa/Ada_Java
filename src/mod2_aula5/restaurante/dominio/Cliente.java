package mod2_aula5.restaurante.dominio;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String endereco;
    private List<Pedido> pedidos;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public String listarPedidosAnteriores() {
        System.out.println("Pedidos anteriores de " + nome + ":");
        String allPedidos = new String();
        for (Pedido pedido : pedidos) {
             allPedidos +=  pedido.toString() + "%n";

        }
        return allPedidos;
    }

    public String listarPedidoAtual(){
        System.out.println("Pedido atual de "+ nome + ":");
        return pedidos.get(pedidos.size()-1).toString();
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

}
