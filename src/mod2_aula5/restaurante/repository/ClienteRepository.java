package mod2_aula5.restaurante.repository;

import mod2_aula5.restaurante.dominio.Cliente;
import mod2_aula5.restaurante.dominio.Pedido;
import mod2_aula5.restaurante.dominio.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> listaClientes;

    public ClienteRepository(){
        listaClientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(int identificador){
        for(Cliente cliente: listaClientes){
            if(cliente.getId() == identificador){
                return cliente;
            }
        }
        return null;
    }

    public void addPedidosCliente(int identificador, Pedido pedido){
        Cliente cliente = buscarCliente(identificador);
        if (cliente != null) {
            cliente.adicionarPedido(pedido);
        }
    }
     public List<Cliente> getListaClientes(){
        return listaClientes;
     }

    public List<Pedido> getListaPedido(int identificador){
        Cliente cliente = buscarCliente(identificador);
        if (cliente != null) {
            return cliente.getPedidos();
        }
        return null;
    }



}
