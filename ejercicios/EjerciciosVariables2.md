# Ejercicio 1
Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa. Sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera como horas extra y estas se pagan al doble de una hora normal cuando no exceden las 8 horas; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga por una hora normal y el resto al triple. El trabajador cobra por hora $40.
### Ejemplo de entrada
```
40
```
### Ejemplo de salida
```
$1600.0
```
### Ejemplo de entrada
```
48
```
### Ejemplo de salida
```
$2240.0
```
### Ejemplo de entrada
```
53
```
### Ejemplo de salida
```
$2840.0
```
# Ejercicio 2
Implemente una aplicación que permita calcular el pago que debe realizar una familia por el consumo de agua potable. Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo. Entre 51 y 200 litros se cobra $0.5 por litro, y más de 200 litros a $1.5 por litro.
### Ejemplo de entrada
```
30
```
### Ejemplo de salida
```
$10.00
```
Pago fijo.
### Ejemplo de entrada
```
120
```
### Ejemplo de salida
```
$45.00  
```
Consumo entre 51 y 200
$(10 + 0.5 \times (120 - 50))$
### Ejemplo de entrada
```
250
```
### Ejemplo de salida
```
$185.00
```
$(10 + 0.5 \times (250 - 50) + 1.5 \times (250 - 200))$
# Ejercicio 3
Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100. El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. El juego continuará hasta que el jugador adivine correctamente el número. Al final, imprima el número y la cantidad de intentos realizados.

### Ejemplo del juego
Número a adivinar: 30.
```
20
"Número demasiado bajo, intenta nuevamente"
39
"Número demasiado alto, intenta nuevamente.
30
"¡Felicidades! ¡Haz adivinado el número!
```