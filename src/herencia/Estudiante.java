package herencia;

public class Estudiante extends Persona {
    private double nota;

    public Estudiante(String nombre, String apellido, String email, double nota)
    {
        super(nombre, apellido, email);
        this.nota = nota;
    }
}
