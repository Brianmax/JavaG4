package org.example.varialblesEstaticas;

public class Usuario {
    private String nombre;
    private String apellido;
    public static int numInstances = 0;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
