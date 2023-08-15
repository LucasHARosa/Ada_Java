package mod2_aula6.impl;

import mod2_aula6.Lista.Lista;

public class ArrayLista extends Lista {

    private int size;
    private Object[] array;

    public ArrayLista(){
        this.array = new Object[10];
    }
    @Override
    public void add(Object obj){
        this.array[size] = obj;
    }
    @Override
    public Object get(int idx){
        if(idx < 0|| idx>=size){
            throw new IndexOutOfBoundsException("posição inexistente");
        }
        return this.array[idx];
    }

    @Override
    public int size(){
        return size;
    }
}
