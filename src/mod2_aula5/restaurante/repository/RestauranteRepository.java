package mod2_aula5.restaurante.repository;

import mod2_aula5.restaurante.dominio.Pedido;
import mod2_aula5.restaurante.dominio.Prato;
import mod2_aula5.restaurante.dominio.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteRepository {
    private List<Restaurante> listaRestaurante;

    public RestauranteRepository(){
        listaRestaurante = new ArrayList<>();
    }

    public void addRestaurante(Restaurante restaurante){
        listaRestaurante.add(restaurante);
    }

    public Restaurante buscarRestaurante(int identificador){
        for (Restaurante restaurante : listaRestaurante){
            if(restaurante.getId() == identificador){
                return restaurante;
            }
        }
        return null;
    }

    public void addPedidosRestaurante(int identificador, Pedido pedido){
        Restaurante restaurante = buscarRestaurante(identificador);
        if (restaurante != null) {
            restaurante.receberPedido(pedido);
        }
    }

    public void addPratosRestaurante (int identificador, Prato prato){
        Restaurante restaurante = buscarRestaurante(identificador);
        if (restaurante != null) {
            restaurante.adicionarPrato(prato);
        }
    }

    public List<Restaurante> getListaRestaurante() {
        return listaRestaurante;
    }

    public List<Prato> getListaPrato(int identificador){
        Restaurante restaurante = buscarRestaurante(identificador);
        if (restaurante != null) {
            return restaurante.getPratosDisponiveis();
        }
        return null;
    }
}
