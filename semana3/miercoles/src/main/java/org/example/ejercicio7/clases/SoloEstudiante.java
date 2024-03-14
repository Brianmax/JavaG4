package org.example.ejercicio7.clases;

import org.example.ejercicio7.interfaces.IEstudiante;

public class SoloEstudiante extends Persona implements IEstudiante {

    public SoloEstudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void iniciarSesion() {
        // iniciando sesion basica
    }

    @Override
    public void cerrarSesion() {

    }

    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

    }
}
