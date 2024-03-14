package org.example.ejercicio7.clases;

public class SoloProfesor extends Persona{
    public SoloProfesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void iniciarSesion() {
        // iniciando sesion con token
    }

    @Override
    public void cerrarSesion() {

    }
}
