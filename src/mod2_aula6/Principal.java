package mod2_aula6;

import mod2_aula6.Lista.Lista;
import mod2_aula6.impl.ArrayLista;
import mod2_aula6.impl.StringArrayLista;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new ArrayLista();

        lista.add("primeiro elemento");
        lista.add(1);



        Lista lista2 = new StringArrayLista();
        lista.add("Lucas Henrique");
        lista.add("Lucas Henrique2");

        impr
    }

    public static  void imprimirLista(Lista lista){
        for(int i = 0; i< lista.size();i++){
            System.out.println(lista[i]);
        }
    }
}
