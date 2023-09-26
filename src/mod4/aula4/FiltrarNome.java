package mod4.aula4;

import java.util.List;
import java.util.stream.Collectors;
public class FiltrarNome {
    public static void main(String[] args) {
        List<Produto1> produtos = List.of(
                new Produto1("Notebook", "Eletrônicos"),
                new Produto1("Camisa", "Vestuário"),
                new Produto1("Smartphone", "Eletrônicos"),
                new Produto1("Tênis", "Calçados"));

        // Filtrar os produtos pela categoria "Vestuário"
        List<Produto1> produtosVestuario = produtos.stream()
                .filter(produto -> produto.getCategoria().equals("Vestuário"))
                .collect(Collectors.toList());

        // Exibir os produtos de vestuário
        for (Produto1 produto : produtosVestuario) {
            System.out.println("Produto1: " + produto.getNome() + ", Categoria: " + produto.getCategoria());
        }
    }

}
