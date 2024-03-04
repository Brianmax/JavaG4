# Loops en Java

Un bucle es una estructura de control que repite un bloque de instrucciones.

## Bucle `for`

El bucle `for` es una estructura de control que nos permite repetir un bloque de código un número determinado de veces. La estructura de un bucle `for` en Java es la siguiente:

```java
for (inicialización; condición; actualización) {
    // Código a ejecutar
}
```

La palabra `for` es una palabra reservada en Java que indica el inicio de un bucle `for`. La inicialización es una expresión que se ejecuta una sola vez al inicio del bucle. La condición es una expresión que se evalúa a verdadero o falso. Si la condición es verdadera, se ejecuta el bloque de código que está dentro de las llaves `{}`. La actualización es una expresión que se ejecuta al final de cada iteración del bucle.

### Ejemplo

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```

El siguiente programa imprime los números del 0 al 4. La variable `i` se inicializa en 0, y se incrementa en 1 en cada iteración del bucle. El bucle se ejecuta mientras `i` sea menor que 5.

### Diagrama de flujo

El siguiente diagrama de flujo muestra el funcionamiento de un bucle `for` en Java.

![Diagrama de flujo][scale](../images/diagramLoops1.png)

Tener en cuenta que la variable `i` se inicializa en 0, pero podemos inicializarla en cualquier valor. La condición es `i < 5`, pero podemos usar cualquier expresión que se evalúe a verdadero o falso. La actualización es `i++`, pero podemos usar cualquier expresión que modifique la variable `i`.

## Bucle `while`

```java
while (condición) {
    // Código a ejecutar
}
```

La palabra `while` es una palabra reservada en Java que indica el inicio de un bucle `while`. La condición es una expresión que se evalúa a verdadero o falso. Si la condición es verdadera, se ejecuta el bloque de código que está dentro de las llaves `{}`. El bucle se repite mientras la condición sea verdadera.

### Ejemplo

```java

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

El siguiente programa imprime los números del 0 al 4. La variable `i` se inicializa en 0, y se incrementa en 1 en cada iteración del bucle. El bucle se ejecuta mientras `i` sea menor que 5.

### Ejemplo

Conjetura de Collatz

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }
}
```

El siguiente programa implementa la conjetura de Collatz. La conjetura de Collatz es una conjetura matemática que dice que, si tomamos cualquier número entero positivo `n`, y si `n` es par, lo dividimos por 2, y si `n` es impar, lo multiplicamos por 3 y le sumamos 1, y repetimos este proceso, eventualmente llegaremos al número 1.

### Diagrama de flujo

![Diagrama de flujo](../images/diagramLoops2.png)