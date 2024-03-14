package org.example.ejercicio7.clases;

import org.example.ejercicio7.interfaces.IEstudiante;
import org.example.ejercicio7.interfaces.IProfesor;

public class EstudianteProfesor extends Persona implements IEstudiante, IProfesor {
    public EstudianteProfesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void iniciarSesion() {
        // sesion basica con token
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

    @Override
    public void calificarExamen() {

    }

    @Override
    public void asignarTarea() {

    }
}
