package org.example.ejercicio7.clases;

import org.example.ejercicio7.interfaces.IUsuario;

public abstract class Persona implements IUsuario {
    protected String nombre;
    protected String apellido;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
