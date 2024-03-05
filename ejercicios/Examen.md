# Examen Java (variables, condicionales, loops)

## Pregunta 1

Ingrese un valor `n` y calcule la suma de los primeros `n` números naturales. Excepto números multiplos de 3 y 5

## Pregunta 2

Ingrese un valor `n` que sera el tamaño de un arreglo. Llene el arreglo con números aleatorios entre 1 y 100. Luego, imprima el arreglo con la suma de sus elementos. Excepto números multiplos de 3 y 5.

## Pregunta 3

Un número primo es un número natural mayor que 1 que tiene únicamente dos divisores distintos: él mismo y el 1. Escriba un programa que reciba un número `n` e imprima si es primo o no.

### Input
```
7
```
### Output
```
Es primo
```

### Input
```
8
```
### Output
```
No es primo
```

## Pregunta 4

Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100. El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. El juego continuará hasta que el jugador adivine correctamente el número. Al final, imprima el número y la cantidad de intentos realizados.

### Ejemplo del juego
Número a adivinar: 50

```bash
20
El número es demasiado bajo
59
El número es demasiado alto
50
¡Felicidades! Adivinaste el número en 3 intentos
```

## Pregunta 5

Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Posteriormente, invierta el array (sin usar el metodo inverse de Collections)

### Input
```
5
```
Un posible array sería: `[1, 2, 3, 4, 5]`

### Output
```
[5, 4, 3, 2, 1]
```


## Pregunta 6

Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Posteriormente, ordene el array de menor a mayor.

### Input
```
5
```
Un posible array sería: `[5, 3, 1, 4, 2]`

### Output
```
[1, 2, 3, 4, 5]
```

## Pregunta 7

Recibes un cuaderno llamado "Cuaderno de deseos". Este cuaderno tiene un numero infinito de paginas. En la ultima pagina de este cuaderno esta escrita una regla que dice "Debes de escribir deseos en este cuaderno durante `n` dias seguidos". Durante el dia `i`, debes escribir exactamente $a_{i}$ deseos. Si no cumples con la regla, el cuaderno desaparecerá y no podrás escribir mas deseos.

Como el cuaderno cumple cualquier deseo, tu no quieres perderlo por lo que ideas una estrategia para cumplir con la regla. Haz calculado que una pagina del cuaderno puede soportar hasta `m` deseos. Comenzaras a escribir deseos desde la primera pagina, cuando la pagina se acabe pasaras a la siguiente. Como regla te pones que usaras la pagina completa. Si despues de un dia la pagina actual puede contener al menos un deseo, entonces comienzas desde esa pagina.

Ahora quieres saber ¿Cuantas veces pasaras de pagina durante cada dia?

### Input
```
3 5
3 7 9
```
La primera linea contiene dos enteros `n` y `m` que representan el numero de dias y la cantidad de deseos que puede soportar una pagina. La segunda linea contiene `n` enteros $a_{i}$ que representan la cantidad de deseos que debes escribir en el dia `i`.

### Output
```
0 2 1 
```
### Input
```
4 20
10 9 19 2
```
### Output
```
0 0 1 1 
```
### Input
```
1 100
99
```
### Output
```
0 
```

### Input
```bash
16 2
999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999 999999999
```
### Output
```bash
499999999 500000000 499999999 500000000 499999999 500000000 499999999 500000000 499999999 500000000 499999999 500000000 499999999 500000000 499999999 500000000 
```

### Input
```bash
1 1
1
```

### Output
```bash
1
```

### Input
```bash
9 9
1 7 1 8 4 7 9 8 8
```

### Output
```bash
0 0 1 0 1 1 1 1 0 
```