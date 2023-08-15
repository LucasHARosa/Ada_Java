package mod2_aula5.restaurante.dominio;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static int contadorCliente = 0;

    private int id;
    private String nome;
    private String endereco;
    private List<Pedido> pedidos;

    public Cliente(String nome, String endereco) {
        this.id = contadorCliente++;
        this.nome = nome;
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }


    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }
}
