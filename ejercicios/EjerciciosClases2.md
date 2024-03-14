# Ejercicio: Clase Genérica en Java - ListaGenérica

## 1. Definición de la Clase ListaGenerica

Crea una nueva clase llamada `ListaGenerica` con un parámetro de tipo genérico `T`.

## 2. Atributos de la Clase

Declara un array de tipo genérico `T` llamado `elementos` para almacenar los elementos de la lista.
Declara un entero `tamaño` para llevar el registro del número de elementos en la lista.
Declara una constante `CAPACIDAD_INICIAL` con un valor de 10.

## 3. Constructor

Crea un constructor que inicialice el array `elementos` con la capacidad inicial y establezca el tamaño inicial en 0.

## 4. Método `agregarElemento`

Implementa un método público llamado `agregarElemento` que tome un parámetro de tipo `T` y lo añada a la lista.
Asegúrate de verificar y aumentar la capacidad del array si es necesario.

## 5. Método `obtenerElemento`

Implementa un método público llamado `obtenerElemento` que tome un índice como parámetro y devuelva el elemento en esa posición.
Lanza una excepción `IndexOutOfBoundsException` si el índice está fuera de los límites de la lista.

## 6. Método `contieneElemento`

Implementa un método público llamado `contieneElemento` que tome un parámetro de tipo `T` y devuelva `true` si el elemento está presente en la lista, y `false` en caso contrario.

## 7. Método Privado `asegurarCapacidad`

Implementa un método privado llamado `asegurarCapacidad` que duplica la capacidad del array si el tamaño actual alcanza la capacidad máxima.

## 8. Método `main` para Pruebas

En el método `main`, crea instancias de `ListaGenerica` para almacenar elementos de tipo `Integer` y `String`.
Agrega elementos a las listas, obtén elementos en posiciones específicas y verifica la presencia de elementos en las listas.


# Ejercicio: Clase Genérica en Java - PilaGenérica

## 1. Definición de la Clase PilaGenerica

Crea una nueva clase llamada `PilaGenerica` con un parámetro de tipo genérico `T`.

## 2. Atributos de la Clase

Declara un array de tipo genérico `T` llamado `elementos` para almacenar los elementos de la pila.

## 3. Constructor

Crea un constructor que inicialice el array `elementos` con la capacidad inicial y establezca el tamaño inicial en 0.

## 4. Método `push`

Implementa un método público llamado `push` que tome un parámetro de tipo `T` y lo añada a la pila.

## 5. Método `pop`

Implementa un método público llamado `pop` que elimine y devuelva el elemento en la cima de la pila.

## 6. Método `top`

Implementa un método público llamado `top` que devuelva el elemento en la cima de la pila sin eliminarlo.

## 7. Método `isEmpty`

Implementa un método público llamado `isEmpty` que devuelva `true` si la pila está vacía, y `false` en caso contrario.

## 8. Método `main` para Pruebas

En el método `main`, crea instancias de `PilaGenerica` para almacenar elementos de tipo `Integer` y `String`.

Agrega elementos a las pilas, desapila elementos, obtén la cima de las pilas y verifica si las pilas están vacías.


# Ejercicio: Clase Genérica en Java - Obtener datos de un Map

## 1. Definición de la Clase ObtenerDatosMap

Recibira un Map con diferentes tipos de datos, debe de crear un metodo que reciba el Map y la clave, y devuelva el valor de la clave.
