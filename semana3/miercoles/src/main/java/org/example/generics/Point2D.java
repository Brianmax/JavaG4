package org.example.generics;

public class Point2D <E extends Number> {
    private E x;
    private E y;

    public Point2D(E x, E y){
        this.x = x;
        this.y = y;
    }

    public E getX(){
        return x;
    }
}
