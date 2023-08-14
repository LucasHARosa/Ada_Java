package mod2_aula5.restaurante.repository;

import mod2_aula5.restaurante.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> listaClientes;

    public ClienteRepository(){
        listaClientes = new ArrayList<>();
    }
}
