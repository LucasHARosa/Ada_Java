package mod2_aula5.restaurante.dominio;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private static int contadorRestaurante = 0;

    private int id;
    private String nome;
    private String endereco;
    private List<Prato> pratosDisponiveis;


    public Restaurante(String nome, String endereco) {
        this.id = contadorRestaurante++;
        this.nome = nome;
        this.endereco = endereco;
        this.pratosDisponiveis = new ArrayList<>();

    }

    public void adicionarPrato(Prato prato) {
        pratosDisponiveis.add(prato);
    }


    public List<Prato> getPratosDisponiveis() {
        return pratosDisponiveis;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "#"+id +
                ", nome='" + nome +
                ", endereco=" + endereco;
    }


}
