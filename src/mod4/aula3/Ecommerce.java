package mod4.aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
public class Ecommerce {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto 1", 100.0));
        produtos.add(new Produto("Produto 2", 50.0));
        produtos.add(new Produto("Produto 3", 30.0));

        Function<List<Produto>,Double> somarDobro = i ->{
            double soma = 0.0;
            for (Produto produto : i) {
                soma += produto.getPreco() * 2;
            }
            return soma;
        };

        double precoTotalDobro = somarDobro.apply(produtos);
        System.out.println("Preço total dos produtos no carrinho (dobro): " + precoTotalDobro);


        double precoTotal = calcularPrecoTotal(produtos, produto -> produto.getPreco());
        System.out.println("Preço total dos produtos no carrinho: " + precoTotal);
    }

    public static double calcularPrecoTotal(List<Produto> produtos, Function<Produto, Double> precoExtractor) {
        double precoTotal = 0.0;
        for (Produto produto : produtos) {
            precoTotal += precoExtractor.apply(produto);
        }
        return precoTotal;
    }
}
