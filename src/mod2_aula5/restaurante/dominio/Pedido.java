package mod2_aula5.restaurante.dominio;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorPedidos = 1;

    private int id;
    private Restaurante restaurante;
    private List<Prato> pratos;
    private Cliente cliente;
    private double total;

    public Pedido(Restaurante restaurante, Cliente cliente) {
        this.id = contadorPedidos++;
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }


    private void calcularTotal() {
        total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
    }


    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "restaurante=" + restaurante +
                ", pratos=" + pratos +
                ", cliente=" + cliente +
                ", total=" + total +
                '}';
    }
}
