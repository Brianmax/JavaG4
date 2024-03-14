# Interfaces en Java

## Definición de una Interfaz

Una interfaz en Java es un tipo de referencia similar a una clase que es declarada con la palabra clave `interface`. Es un mecanismo para definir un contrato que las clases deben seguir al implementar la interfaz. Una interfaz puede contener métodos abstractos, métodos estáticos, métodos predeterminados, constantes y tipos anidados.

```java
public interface ICalculadora {

    int resta(int a, int b);
    int suma(int a, int b); 
}
```

## Implementación de una Interfaz

Una clase puede implementar una o más interfaces. Para implementar una interfaz, la clase debe proporcionar implementaciones para todos los métodos abstractos definidos en la interfaz. La implementación se realiza utilizando la palabra clave `implements`.

```java

public class CalculadoraImpl implements ICalculadora {

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }
}
```

## Variables de tipo de Interfaz

Una variable de tipo de interfaz puede hacer referencia a cualquier objeto de una clase que implemente la interfaz. Esto permite que las clases que implementan la interfaz sean tratadas polimórficamente.

```java

ICalculadora calc = new CalculadoraImpl();
```

En el ejemplo anterior, la variable `calc` es de tipo `ICalculadora` y hace referencia a un objeto de la clase `CalculadoraImpl` que implementa la interfaz `ICalculadora`. Esto es posible porque `CalculadoraImpl` proporciona implementaciones para todos los métodos abstractos definidos en la interfaz `ICalculadora`.

La limitación de una variable de tipo de interfaz es que solo puede acceder a los métodos definidos en la interfaz, incluso si el objeto al que hace referencia es de una clase que implementa la interfaz y tiene métodos adicionales.


## Herencia multiple en Java

Java no admite herencia múltiple de clases, pero una clase puede implementar múltiples interfaces. Esto permite que una clase herede el comportamiento de múltiples interfaces.

```java

public interface IOperacionesBasicas {

    int resta(int a, int b);
    int suma(int a, int b);
}

public interface IOperacionesAvanzadas {

    int multiplicacion(int a, int b);
    int division(int a, int b);
}

public class CalculadoraImpl implements IOperacionesBasicas, IOperacionesAvanzadas {

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
```

En el ejemplo anterior, la clase `CalculadoraImpl` implementa las interfaces `IOperacionesBasicas` e `IOperacionesAvanzadas`, lo que le permite heredar el comportamiento de ambas interfaces.
