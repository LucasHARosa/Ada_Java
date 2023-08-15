package mod2_aula5.restaurante.service;

import mod2_aula5.restaurante.dominio.Cliente;
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

    public List<Cliente> buscaCliente(){
        return clienteRepository.getListaClientes();
    }


}
