package mod2_aula5.restaurante.dominio;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorPedidos = 0;

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
        calcularTotal();
    }


    private void calcularTotal() {
        total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
    }

    public void addPrato(Prato prato){
        pratos.add(prato);
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public List<Prato> getPratos() {
        return pratos;
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
