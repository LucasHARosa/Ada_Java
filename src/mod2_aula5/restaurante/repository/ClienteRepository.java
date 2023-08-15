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

    public Cliente selecionaCliente(int identificador){
        for(Cliente cliente: listaClientes){
            if(cliente.getId() == identificador){
                return cliente;
            }
        }
        return null;
    }

     public List<Cliente> getListaClientes(){
        return listaClientes;
     }



}
