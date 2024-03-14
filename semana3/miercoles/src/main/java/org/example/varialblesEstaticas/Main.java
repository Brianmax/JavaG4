package org.example.varialblesEstaticas;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("George", "Maxi");
        Usuario usuario2 = new Usuario("Jose", "Chavez");

        System.out.println(Usuario.numInstances);

        Usuario.numInstances++;

        System.out.println(Usuario.numInstances);
        System.out.println(usuario2.numInstances);

        usuario2.numInstances++;

        System.out.println("====================");
        System.out.println(Usuario.numInstances);
        System.out.println(usuario2.numInstances);
    }
}
