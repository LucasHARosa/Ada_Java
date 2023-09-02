package mod2.mod2_aula7;

import mod2.mod2_aula7.impl.PilhaImpl;

public class Principal {
    public static void main(String[] args) {
        PilhaImpl pilha = new PilhaImpl();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        System.out.println(pilha.toString());
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Desempilhando 2 itens " );
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.toString());
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());

    }
}
