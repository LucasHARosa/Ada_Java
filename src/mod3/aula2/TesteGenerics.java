package mod3.aula2;

import java.util.ArrayList;
import java.util.List;

public class TesteGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);
        //Em segundo lugar, perceba o uso do operador "diamante" <> junto ao ArrayList. Quando o Generics foi criado,
        // no Java 5, era necessário definir o parâmetro duas vezes List<<String> list = new ArrayList<String>(). Mas,
        // isso gerava uma repetição desnecessária. Então, no Java 7, foi removida a necessidade de repetir e, portanto,
        // só precisamos definir junto ao tipo.
        //
        //A terceira e última mudança, está na última linha String s = list.get(0) em que não há mais a necessidade de
        // casting, visto que todos os itens da coleção serão, obrigatoriamente, do tipo String. Com isso, ao tentar
        // inserir itens de outro tipo, causará erro de compilação.
    }
}
