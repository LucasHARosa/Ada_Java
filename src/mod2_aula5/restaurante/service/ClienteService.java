package mod2_aula5.restaurante.service;

import mod2_aula5.restaurante.dominio.Cliente;
import mod2_aula5.restaurante.dominio.Pedido;
import mod2_aula5.restaurante.dominio.Restaurante;
import mod2_aula5.restaurante.repository.ClienteRepository;

import java.util.List;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void addCliente (String nome, String endereco){
        Cliente cliente = new Cliente(nome,endereco);
        clienteRepository.addCliente(cliente);

    }


    public List<Cliente> findAllClientes(){
        return clienteRepository.getListaClientes();
    }
    public Cliente buscarCliente(int identificador){
        return clienteRepository.selecionaCliente(identificador);
    }
    public Cliente ultimoCliente(){
        List<Cliente> clientes = findAllClientes();
        return clientes.get(clientes.size()-1);
    }

}
