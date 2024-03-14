package org.example.generics;

import org.example.interfaces.UsuarioImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Hola");
//        arrayList.add("Hello");
//
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(1);
//        arrayList2.add(4);
//
//        ArrayList<UsuarioImpl> arrayList3 = new ArrayList<>();
//        arrayList3.add(new UsuarioImpl());

        Point2D<Integer> point2D = new Point2D<>(1,2);

        // Point2D<String> point2DString = new Point2D<>("hola", "hello");

    }
}
