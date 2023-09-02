package mod2.mod2_aula7.contrato;

import java.util.ArrayList;

public abstract class Pilha {
    protected ArrayList<Integer> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public abstract void push(Integer item);
    public abstract void pop();
    public abstract Integer peek();
    public abstract boolean isEmpty();
    public abstract int size();
}
