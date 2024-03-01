# Ejercicio 1
Para un número entero n, determinar si es par o impar. En caso de ser par, imprimir "Par", en caso contrario, imprimir "Impar".
## Input
```
5
```
## Output
```
Impar
```
## Input
```
10
```
## Output
```
Par
```
## Input
```
0
```
## Output
```
Par
```

# Ejercicio 2
Para un número entero n, determinar si es positivo, negativo o cero. En caso de ser positivo, imprimir "Positivo", en caso de ser negativo, imprimir "Negativo", en caso de ser cero, imprimir "Cero".
## Input
```
5
```
## Output
```
Positivo
```
## Input
```
-10
```
## Output
```
Negativo
```
## Input
```
0
```
## Output
```
Cero
```

# Ejercicio 3
Para un número entero n, determinar si es múltiplo de 3 o de 5. En caso de ser múltiplo de 3, imprimir "Múltiplo de 3", en caso de ser múltiplo de 5, imprimir "Múltiplo de 5", en caso de ser múltiplo de ambos, imprimir "Múltiplo de 3 y 5", en caso de no ser múltiplo de ninguno, imprimir "No es múltiplo de 3 ni de 5".
## Input
```
15
```
## Output
```
Múltiplo de 3 y 5
```
## Input
```
10
```
## Output
```
Múltiplo de 5
```
## Input
```
9
```
## Output
```
Múltiplo de 3
```
## Input
```
7
```
## Output
```
No es múltiplo de 3 ni de 5
```

# Ejercicio 4
Para dos números enteros n y m, determinar si n es igual a m.
## Input
```
5 5
```
## Output
```
Iguales
```
## Input
```
10 5
```
## Output
```
Diferentes
```
## Input
```
0 0
```
## Output
```
Iguales
```

# Ejercicio 5
Escriba un programa que lea tres números enteros e imprima el mayor de ellos.
## Input
```
5 10 15
```
## Output
```
15
```
## Input
```
-5 10 5
```
## Output
```
10
```

# Ejercicio 6
Escriba un programa que determine la elegibilidad para la admision a un programa universitario basado en el siguiente criterio:
- Nota en matemáticas mayor o igual a 65.
- Nota en física mayor o igual a 55.
- Nota en química mayor o igual a 50.
- O el total de las notas en física y matemáticas debe ser mayor o igual a 140.

El programa debe imprimir "Admitido" si el estudiante cumple con los requisitos, en caso contrario, debe imprimir "No admitido".

## Input
```
70 60 50
```
## Output
```
Admitido
```
## Input
```
60 60 60
```
## Output
```
No admitido
```
## Input
```
70 70 70
```
## Output
```
Admitido
```

# Ejercicio 7
Escriba un programa que lea la temperatura en grados centigrados y muestre un mensaje de acuerdo a la siguiente tabla:
- Si la temperatura es menor a 0, mostrar "Congelado".
- Temperatura entre 0 y 10, mostrar "Muy frío".
- Temperatura entre 11 y 20, mostrar "Frío".
- Temperatura entre 21 y 30, mostrar "Normal".
- Temperatura entre 31 y 40, mostrar "Caliente".
- Temperatura mayor a 40, mostrar "Muy caliente".

## Input
```
-5
```
## Output
```
Congelado
```
## Input
```
15
```
## Output
```
Frío
```
## Input
```
35
```
## Output
```
Caliente
```

# Ejercicio 8

Escriba un programa que reciba un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, excepto aquellos divisibles por 100 pero no por 400.

## Ejemplo
2000 es bisiesto.
- 2000 es divisible por 4.
- 2000 es divisible por 100.

Ya que 2000 es divisible por 4 y 100, para que este año sea bisiesto debe ser divisible por 400, lo cual es cierto.
- 2000 es divisible por 400.

2024 es bisiesto.
- 2024 es divisible por 4.
- 2024 no es divisible por 100.
Con solo esto es suficiente para que sea bisiesto.

2021 no es bisiesto.
- 2021 no es divisible por 4.


# Ejercicio 9
Escriba un programa que permita calcular el porcentaje de asistencia a clases de un estudiante. El programa debe recibir el número de clases a las que asistió el estudiante y el número total de clases. El porcentaje de asistencia se calcula como el cociente entre el número de clases a las que asistió el estudiante y el número total de clases, multiplicado por 100. En caso de que el porcentaje sea mayor o igual a 75, el programa debe imprimir "Asistencia suficiente". En caso contrario, debe imprimir "Asistencia insuficiente".

## Input
```
20 25
```
## Output
```
Asistencia suficiente
```
## Input
```
10 20
```
## Output
```
Asistencia insuficiente
```
## Input
```
30 40
```
## Output
```
Asistencia suficiente
```

# Ejercicio 10

Escriba un programa que determine la categoria de un producto basado en su precio. La categoría se determina de la siguiente manera:
- Si el precio es mayor a 100 y el peso es mayor a 10, la categoría es "Premium".
- Si el precio es mayor a 100 y el peso es menor o igual a 10, la categoría es "Normal".
- Si el precio es menor o igual a 100 la categoría es "Económico".

El programa debe recibir el precio y el peso del producto e imprimir la categoría.

## Input
```
120 15
```
## Output
```
Premium
```
## Input
```
120 5
```
## Output
```
Normal
```
## Input
```
50 5
```
## Output
```
Económico
```