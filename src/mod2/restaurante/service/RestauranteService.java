package mod2.restaurante.service;

import mod2.restaurante.dominio.Prato;
import mod2.restaurante.dominio.Restaurante;
import mod2.restaurante.repository.RestauranteRepository;

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
    public Restaurante buscarRestaurante(int identificador){
        return restauranteRepository.selecionaRestaurante(identificador);
    }
    public Prato buscarPrato(int identificadorPrato, int identificadorRestaurante ){
        Restaurante restaurante = buscarRestaurante(identificadorRestaurante);
        return restauranteRepository.selecionaPrato(identificadorPrato,restaurante);
    }
    public List<Restaurante> findAllRestaurantes(){
        return restauranteRepository.getListaRestaurante();
    }

    public List<Prato> findAllPratos(int identificador){
        return restauranteRepository.getListaPrato(identificador);
    }

    public void adicionarPrato(int identificador, String nome, double preco, String descricao){
        Prato prato = new Prato(nome,preco, descricao);
        restauranteRepository.addPratosRestaurante(identificador,prato);
    }
    public boolean validaRestaurante(int identificador){
        Restaurante restaurante = restauranteRepository.selecionaRestaurante(identificador);
        if(restaurante!= null){
            return true;
        }
        else{
            return false;
        }
    }

}
