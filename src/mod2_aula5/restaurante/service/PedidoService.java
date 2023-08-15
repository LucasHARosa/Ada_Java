package mod2_aula5.restaurante.service;

import mod2_aula5.restaurante.dominio.Cliente;
import mod2_aula5.restaurante.dominio.Pedido;
import mod2_aula5.restaurante.dominio.Prato;
import mod2_aula5.restaurante.dominio.Restaurante;
import mod2_aula5.restaurante.repository.PedidoRepository;

import java.util.List;

public class PedidoService {
    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository =pedidoRepository;
    }
    public void addPedidos(Restaurante restaurante, Cliente cliente){
        Pedido pedido = new Pedido(restaurante,cliente);
        pedidoRepository.addPedido(pedido);
    }

    public Pedido ultimoPedido(){
        List<Pedido> pedidos = pedidoRepository.getListaPedidos();
        return pedidos.get(pedidos.size()-1);
    }

    public void adicionarPrato(Prato prato){
        Pedido pedido = ultimoPedido();
        pedidoRepository.addPrato(pedido.getId(),prato);
    }

    public List<Pedido> buscarPedidosRestaurantes(int identificador){
        return pedidoRepository.filtrarRestaurante(identificador);
    }

    public List<Pedido> buscarPedidosClientes(int identificador){
        return pedidoRepository.filtrarCliente(identificador);
    }
}
