package mod2.mod2_aula7.impl;

import mod2.mod2_aula7.contrato.Pilha;

public class PilhaImpl extends Pilha {
    @Override
    public void push(Integer item) {
        elementos.add(item);
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            int lastIndex = elementos.size() - 1;
            elementos.remove(lastIndex);
        }

    }

    @Override
    public Integer peek() {
        if (!isEmpty()) {
            int lastIndex = elementos.size() - 1;
            return elementos.get(lastIndex);
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public int size() {
        return elementos.size();
    }

    @Override
    public String toString() {
        return "PilhaImpl{" +
                "elementos=" + elementos +
                '}';
    }
}
