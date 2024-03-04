# Ejercicio 1

Imprimir los numeros del 1 al 100.

# Ejercicio 2

Imprimir los numeros del 100 al 1.

# Ejercicio 3

Imprimir los numeros pares del 1 al 100.

# Ejercicio 4

Imprimir los numeros impares del 1 al 100.

# Ejercicio 5

Imprimir los numeros del 1 al 100, excepto los multiplos de 3.

# Ejercicio 6

Imprimir los numeros del 1 al 100, excepto los multiplos de 3 y 5.

# Ejercicio 7

Declarar un arreglo de 10 elementos e imprimir sus valores.

# Ejercicio 8

Declarar un arreglo de 10 elementos e imprimir sus valores en orden inverso.

# Ejercicio 9

Declarar un arreglo de 10 elementos e imprimir la suma de sus valores.

# Ejercicio 10

Declarar un arreglo de `n` elementos y buscar el mayor valor.

# Ejercicio 11

Declarar un arreglo de `n` elementos y buscar un valor `x` en el arreglo. En caso de encontrarlo, imprimir su posición, en caso de no encontrarlo, imprimir "No encontrado".

# Ejercicio 12
Crea un programa que cuente cuántas veces aparece una letra específica en una cadena.

## Input
```
Java es un lenguaje de programacion
a
```
## Output
```
5
```

## Ejercicio 13

Crea un programa que imprima la tabla de multiplicar del 1 al 10.

## Ejemplo de output
```
Tabla de multiplicación del 1:
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
...
1 x 10 = 10

Tabla de multiplicación del 2:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
...
2 x 10 = 20

...
```

# Ejercicio 14

Dado un número entero `n`, realizar las siguientes operaciones:
- Si `n` es par, dividirlo entre 2.
- Si `n` es impar, multiplicarlo por 3 y sumar 1.
Repetir el proceso hasta que `n` sea 1.

# Ejercicio 15

Como objetivo este año, te propones leer la mayor cantidad de libros posibles. Hoy, tienes `t` minutos para leer. Tomas `n` libros de la biblioteca, cada uno con un tiempo de lectura $a_{i}$. ¿Cuál es la mayor cantidad de libros que puedes leer en `t` minutos?

# Input
```
4 5
3 1 2 1
```
La primera linea contiene dos enteros `n` y `t` que representan el número de libros y el tiempo que tienes para leer. La segunda linea contiene `n` enteros $a_{i}$ que representan el tiempo de lectura de cada libro.

# Ejercicio 16

Basado en el ejercicio anterior, ahora debes de seguir la siguiente regla: El orden de los libros no puede ser alterado. Es decir, si tomas el libro `i`, debes de leerlo antes que el libro `i+1`. Además, una vez que lees un libro, lo leerás completo. ¿Cuál es la mayor cantidad de libros que puedes leer en `t` minutos?
Con el objetivo de maximizar la cantidad de libros que puedes leer, puedes empezar a leer desde cualquier libro. Solo ten en cuenta que después de escoger un libro debes de leer los siguientes libros en orden.

# Input 
```
4 4
3 1 2 1
```
# Output
```
3
```

Tenemos 4 minutos y 4 libros por leer. Si empezamos a leer desde el primer libro que tiene un tiempo de 3 minutos, nos quedaran 1 minuto para leer el siguiente libro, por lo que solo podremos leer 2 libros en total. Si empezamos a leer desde el segundo libro que tiene un tiempo de 1 minuto, nos quedaran 3 minutos para leer el siguiente libro, al leer el libro 3 que tiene un tiempo de 2 minutos, nos quedaran 1 minuto para leer el siguiente libro, por lo que podremos leer 3 libros en total.

# Ejercicio 17

Dada una matriz de `n` x `m` elementos. Debes de encontrar el valor máximo de la matriz.

# Ejercicio 18

Encuentras una matriz de `n` x `m` elementos. Cada elemento de la matriz es un número entero positivo uno consecutivo del anterior. De acuerdo a la forma en que se encuentran los elementos tendremos dos tipos de enumeración:
## Enumeracion por columnas

Las celdas son enumeradas comenzando por 1, de izquierda a derecha y en cada columna de arriba hacía abajo.

# Ejemplo

$$
\begin{bmatrix}
1 & 4 & 7 & 10 & 13 \\
2 & 5 & 8 & 11 & 14 \\
3 & 6 & 9 & 12 & 15 \\
\end{bmatrix}
$$

La matriz anterior tiene 3 filas y 5 columnas.

## Enumeracion por filas

Las celdas son enumeradas comenzando por 1, de arriba hacía abajo y en cada fila de izquierda a derecha.

# Ejemplo

$$
\begin{bmatrix}
1 & 2 & 3 & 4 & 5 \\
6 & 7 & 8 & 9 & 10 \\
11 & 12 & 13 & 14 & 15 \\
\end{bmatrix}
$$

Tu objetivo es encontrar el valor de la celda `a` en la enumeración por filas.

# Input
```
3
1 1 1
2 2 3
3 5 11
```
# Output
```
1
2
9
```
El primer numero `3` indica el número de casos de prueba. Cada caso de prueba tiene tres números enteros `n`, `m` y `a` que representan el número de filas, el número de columnas y el número de la celda a buscar en la enumeración por filas.

El primer caso de prueba tiene 1 fila, 1 columna y el número de celda a buscar es 1. El segundo caso de prueba tiene 2 filas, 2 columnas y el número de celda a buscar es 3. El tercer caso de prueba tiene 3 filas, 5 columnas y el número de celda a buscar es 11.

Veamos el ejemplo de la matriz de 3x5 elementos:

$$
\begin{bmatrix}
1 & 4 & 7 & 10 & 13 \\
2 & 5 & 8 & \textcolor{red}{11} & 14 \\
3 & 6 & 9 & 12 & 15 \\
\end{bmatrix}
$$

Nuestro objetivo es averiguar cual seria el valor de la celda 11 en la enumeración por filas. Si dibujamos la enumeracion por filas de la matriz anterior, obtendremos:

$$
\begin{bmatrix}
1 & 2 & 3 & 4 & 5 \\
6 & 7 & 8 & \textcolor{red}{9} & 10 \\
11 & 12 & 13 & 14 & 15 \\
\end{bmatrix}
$$

Podemos observar que es el número 9, tal como se muestra en el output.