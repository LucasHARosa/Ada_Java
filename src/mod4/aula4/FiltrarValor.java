package mod4.aula4;
import java.util.Comparator;
import java.util.List;


public class FiltrarValor {
    public static void main(String[] args) {
        List<Produto2> produtos = List.of(
                new Produto2("Notebook", 2500.0),
                new Produto2("Camisa", 50.0),
                new Produto2("Smartphone", 1200.0),
                new Produto2("Tênis", 150.0)
        );

        // Encontrar o produto mais caro
        Produto2 produtoMaisCaro = produtos.stream()
                .max(Comparator.comparingDouble(Produto2::getPreco))
                .orElseThrow();

        // Encontrar o produto mais barato
        Produto2 produtoMaisBarato = produtos.stream()
                .min(Comparator.comparingDouble(Produto2::getPreco))
                .orElseThrow();

        System.out.println("Produto mais caro: " + produtoMaisCaro.getNome());
        System.out.println("Produto mais barato: " + produtoMaisBarato.getNome());
    }

}
