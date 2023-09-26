package mod4.aula5;
import mod4.aula4.Produto2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class ListaProduto {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );


        System.out.println("Produtos com preço acima de 500:");
        produtos.stream()
                .filter(produto -> produto.getPreco() > 500)
                .forEach(produto -> System.out.println(produto.getNome()));

        System.out.println("\nLista de preços dos produtos:");
        produtos.stream()
                .map(Produto::getPreco)
                .forEach(System.out::println);

        Produto produtoMaisBarato = produtos.stream()
                .min(Comparator.comparingDouble(Produto::getPreco))
                .orElse(null);

        if (produtoMaisBarato != null) {
            System.out.println("\nProduto mais barato: " + produtoMaisBarato.getNome() +
                    ", Preço: " + produtoMaisBarato.getPreco());
        } else {
            System.out.println("\nNenhum produto encontrado.");
        }


        System.out.println("\nProdutos com quantidade em estoque menor que 10:");
        produtos.stream()
                .filter(produto -> produto.getQuantidade() < 10)
                .forEach(produto -> System.out.println(produto.getNome()));
    }
}
