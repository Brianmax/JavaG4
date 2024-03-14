# Clases abstractas en Java

Una clase abstracta es una clase que no puede ser instanciada y que puede contener métodos abstractos. Los métodos abstractos son métodos que no tienen implementación y deben ser implementados por las subclases. Una clase abstracta puede contener métodos concretos, métodos abstractos, atributos y constructores.

## Definición de una Clase Abstracta

Una clase abstracta en Java es una clase que es declarada con la palabra clave `abstract`. Una clase abstracta puede contener métodos abstractos y métodos concretos.

```java

public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
```

## Implementación de una Clase Abstracta

Una clase puede extender una sola clase abstracta. En otras palabras una clase solo puede tener un padre. Para extender una clase abstracta, la subclase debe proporcionar implementaciones para todos los métodos abstractos definidos en la clase abstracta. La implementación se realiza utilizando la palabra clave `extends`.

```java

public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
```

```java

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
```

## Variables de tipo de Clase Abstracta

Una variable de tipo de una clase abstracta puede almacenar una referencia a un objeto de una subclase de la clase abstracta. Por ejemplo, una variable de tipo `Figura` puede almacenar una referencia a un objeto de tipo `Circulo` o `Rectangulo`.

```java

Circulo circulo = new Circulo("rojo", 5);

```

En este ejemplo podemos ver que declaramos una variable de tipo `Circulo` y la inicializamos con un objeto de tipo `Circulo`.

```java

Figura figura = new Circulo("rojo", 5);

```

En este ejemplo podemos ver que declaramos una variable de tipo `Figura` y la inicializamos con un objeto de tipo `Circulo`. Esto es posible porque `Circulo` es una subclase de `Figura`.

La desventaja de usar una variable de tipo de clase abstracta es que solo podemos acceder a los métodos y atributos de la clase abstracta. Si queremos acceder a los métodos y atributos de la subclase, necesitamos hacer un *casting*.

```java

Figura figura = new Circulo("rojo", 5);
Circulo circulo = (Circulo) figura;

```

En este ejemplo podemos ver que declaramos una variable de tipo `Figura` y la inicializamos con un objeto de tipo `Circulo`. Luego hacemos un *casting* para convertir la variable de tipo `Figura` a una variable de tipo `Circulo`.
