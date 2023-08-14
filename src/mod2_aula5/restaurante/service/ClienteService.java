package mod2_aula5.restaurante.service;

import mod2_aula5.restaurante.repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

}
