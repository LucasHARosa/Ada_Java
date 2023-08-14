package mod2_aula5.restaurante.service;

import mod2_aula5.restaurante.dominio.Pedido;
import mod2_aula5.restaurante.dominio.Prato;
import mod2_aula5.restaurante.dominio.Restaurante;
import mod2_aula5.restaurante.repository.RestauranteRepository;

import java.util.List;

public class RestauranteService {
    private RestauranteRepository restauranteRepository;

    public RestauranteService(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public void addRestaurantes (String nome, String endereco){
        Restaurante restaurante = new Restaurante(nome, endereco);
        restauranteRepository.addRestaurante(restaurante);
    }

    public List<Restaurante> buscaRestaurante(){
        return restauranteRepository.getListaRestaurante();
    }

    public List<Prato> buscaPrato(int identificador){
        return restauranteRepository.getListaPrato(identificador);
    }

    public void adicionarPrato(int identificador, String nome, double preco, String descricao){
        Prato prato = new Prato(nome,preco, descricao);
        restauranteRepository.addPratosRestaurante(identificador,prato);
    }

}
