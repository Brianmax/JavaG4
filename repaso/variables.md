# Variables en Java
Una variable es un espacio de memoria que se reserva para almacenar un dato. En Java, las variables se declaran con un tipo de dato y un nombre. El tipo de dato indica el tipo de valor que puede almacenar la variable, y el nombre es el identificador que se utilizará para acceder a la variable.

## Declaración de variables
En Java, las variables se declaran con la siguiente sintaxis:
```java
tipo nombre = valor;
```
Donde `tipo` es el tipo de dato de la variable, y `nombre` es el nombre de la variable que se está declarando. El `valor` es el valor que se le asigna a la variable.

Por ejemplo, para declarar una variable de tipo entero con nombre `numero`, se utiliza la siguiente sintaxis:
```java
int numero = 10;
```

## Tipos de datos
En Java, existen varios tipos de datos que se pueden utilizar para declarar variables. Algunos de los tipos de datos más comunes son:
- `short`: para almacenar números enteros cortos.
- `int`: para almacenar números enteros.
- `long`: para almacenar números enteros largos.
- `float`: para almacenar números decimales hasta 7 dígitos.
- `double`: para almacenar números decimales hasta 15 dígitos.
- `String`: para almacenar cadenas de texto.

A continuación, se muestran algunos ejemplos de declaraciones de variables en Java:
```java
int edad = 25;
double altura = 1.75;
String nombre = "Juan";
```

Para las variables de tipo `float` al declararlas se debe agregar la letra `f` al final del valor para indicar que es un valor de tipo `float`.
```java
float precio = 10.5f;
```
Esto se debe a que por defecto, los números decimales en Java se consideran de tipo `double`, por lo que es necesario indicar explícitamente que el valor es de tipo `float`.

## Modificación de variables
Una vez que una variable ha sido declarada, su valor puede ser modificado en cualquier momento. Para modificar el valor de una variable, se utiliza la siguiente sintaxis:
```java
nombreVariable = nuevoValor;
```
Donde `nombreVariable` es el nombre de la variable que se quiere modificar, y `nuevoValor` es el nuevo valor que se le asignará a la variable.

Por ejemplo, para modificar el valor de la variable `edad` declarada anteriormente, se utiliza la siguiente sintaxis:
```java
edad = 30;
```
## Operaciones con variables
Las variables en Java pueden ser utilizadas en operaciones matemáticas y lógicas. Por ejemplo, se pueden sumar, restar, multiplicar o dividir variables de tipo numérico.

A continuación, se muestran algunos ejemplos de operaciones con variables en Java:
```java
int a = 5;
int b = 3;
int suma = a + b; // suma = 8
int resta = a - b; // resta = 2
int multiplicacion = a * b; // multiplicacion = 15
```

Con la operacion de division, se debe tener en cuenta que si se divide un entero entre otro entero, el resultado será un entero. Por ejemplo, si se divide 5 entre 3, el resultado será 1, ya que el resultado se redondea hacia abajo. Para obtener un resultado decimal, al menos uno de los operandos debe ser de tipo `float` o `double`.

```java
int a = 5;
int b = 3;
int divisionEntera = a / b; // divisionEntera = 1
float divisionDecimal = (float) a / b; // divisionDecimal = 1.6666666
```
```java
float a = 5;
float b = 3;
float divisionDecimal = a / b; // divisionDecimal = 1.6666666
```

Tambien podemos modificar el valor de una variable usando el valor actual de la misma. Por ejemplo, si queremos incrementar el valor de una variable en 5, podemos hacerlo de la siguiente manera:
```java
int numero = 5;
numero = numero + 7; // numero = 12
```

En este caso, el valor actual de la variable `numero` que es 5, se suma con 7 y el resultado se almacena nuevamente en la variable `numero`.

Lo mismo se puede hacer con el resto de operaciones matemáticas.

```java
int numero = 5;
numero = numero - 3; // numero = 2
```
```java
int numero = 5;
numero = numero * 2; // numero = 10
```
```java
int numero = 5;
numero = numero / 2; // numero = 2
```
## Operaciones con cadenas de texto
En Java, también es posible realizar operaciones con variables de tipo `String`. Por ejemplo, se pueden concatenar cadenas de texto utilizando el operador `+`.

A continuación, se muestra un ejemplo de concatenación de cadenas de texto en Java:
```java
String nombre = "Juan";
String apellido = "Perez";
String nombreCompleto = nombre + " " + apellido; // nombreCompleto = "Juan Perez"
```

## Input de datos
Para obtener datos del usuario, se puede utilizar la clase `Scanner` de Java. Esta clase permite leer datos de la entrada estándar (generalmente el teclado) y almacenarlos en variables.

A continuación, se muestra un ejemplo de cómo utilizar la clase `Scanner` para obtener un número entero del usuario:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("El número ingresado es: " + numero);
    }
}
```

En este ejemplo, se crea un objeto de la clase `Scanner` y se utiliza el método `nextInt()` para obtener un número entero del usuario. El número ingresado por el usuario se almacena en la variable `numero`, y luego se imprime en la consola.