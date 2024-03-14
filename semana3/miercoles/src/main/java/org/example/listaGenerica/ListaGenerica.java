package org.example.listaGenerica;

import java.util.List;

public class ListaGenerica <T> {
    private T[] elementos;
    // int[] name;
    private int tamanio;
    private int capacidad_inicial = 10;
    public ListaGenerica(){
        this.elementos = (T[]) new Object[capacidad_inicial];
        int[] array = new int[4];
    }
}
