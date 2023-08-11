package mod2_aula5.restaurante.dominio;

public class Restaurante {
    private String nome;
    private String endereco;
    private List<Prato> pratosDisponiveis;
    private List<Pedido> pedidos;

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pratosDisponiveis = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratosDisponiveis.add(prato);
    }

    public void listarPratos() {
        System.out.println("Pratos disponíveis no restaurante " + nome + ":");
        for (Prato prato : pratosDisponiveis) {
            System.out.println(prato.getNome() + " - R$" + prato.getPreco());
        }
    }

    public void receberPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        System.out.println("Pedidos recebidos no restaurante " + nome + ":");
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido #" + pedido.getId() + ": " + pedido.getTotal() + " - Entregar em: " + pedido.getEnderecoEntrega());
        }
    }

}
