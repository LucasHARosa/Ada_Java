package mod2.restaurante.repository;

import mod2.restaurante.dominio.Prato;
import mod2.restaurante.dominio.Restaurante;

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

    public Restaurante selecionaRestaurante(int identificador){
        for (Restaurante restaurante : listaRestaurante){
            if(restaurante.getId() == identificador){
                return restaurante;
            }
        }
        return null;
    }

    public Prato selecionaPrato(int identificador, Restaurante restaurante){
        for(Prato prato : restaurante.getPratosDisponiveis()){
            if(prato.getId()==identificador){
                return prato;
            }
        }
        return null;
    }


    public void addPratosRestaurante (int identificador, Prato prato){
        Restaurante restaurante = selecionaRestaurante(identificador);
        if (restaurante != null) {
            restaurante.adicionarPrato(prato);
        }
    }

    public List<Restaurante> getListaRestaurante() {
        return listaRestaurante;
    }

    public List<Prato> getListaPrato(int identificador){
        Restaurante restaurante = selecionaRestaurante(identificador);
        if (restaurante != null) {
            return restaurante.getPratosDisponiveis();
        }
        return null;
    }


}
