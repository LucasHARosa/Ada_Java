package mod2_aula5.restaurante.repository;

import mod2_aula5.restaurante.dominio.Pedido;
import mod2_aula5.restaurante.dominio.Prato;
import mod2_aula5.restaurante.dominio.Restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoRepository {

    private List<Pedido> listaPedidos;

    public PedidoRepository(){
        listaPedidos = new ArrayList<>();
    }

    public void addPedido(Pedido pedido){
        listaPedidos.add(pedido);
    }

    public Pedido selecionaPedido(int identificador){
        for (Pedido pedido : listaPedidos){
            if(pedido.getId() == identificador){
                return pedido;
            }
        }
        return null;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void addPrato(int identificador, Prato prato){
        Pedido pedido = selecionaPedido(identificador);
        if(pedido != null){
            pedido.addPrato(prato);
        }
    }

    public List<Pedido> filtrarRestaurante(int identificador){
        List<Pedido> filteredList = listaPedidos.stream()
                .filter(item -> item.getRestaurante().getId() == identificador)
                .collect(Collectors.toList());
        return filteredList;
    }

    public List<Pedido> filtrarCliente(int identificador){
        List<Pedido> filteredList = listaPedidos.stream()
                .filter(item -> item.getCliente().getId() == identificador)
                .collect(Collectors.toList());
        return filteredList;
    }


}
