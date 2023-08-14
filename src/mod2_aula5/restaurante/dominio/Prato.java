package mod2_aula5.restaurante.dominio;

public class Prato {
    private static int contadorPratos = 0;

    private int id;
    private String nome;
    private double preco;
    private String descricao;

    public Prato(String nome, double preco, String descricao) {
        this.id = contadorPratos++;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
