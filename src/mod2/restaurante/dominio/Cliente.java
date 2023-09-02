package mod2.restaurante.dominio;

public class Cliente {
    private static int contadorCliente = 0;

    private int id;
    private String nome;
    private String endereco;


    public Cliente(String nome, String endereco) {
        this.id = contadorCliente++;
        this.nome = nome;
        this.endereco = endereco;

    }





    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "#" + id +
                ", nome='" + nome +
                ", endereco=" + endereco ;
    }
}
