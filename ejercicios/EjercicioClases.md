# Ejercicio 1

Crear una clase `Dog` con los siguientes atributos:

- `breed` de tipo `String`
- `age` de tipo `int`
- `color` de tipo `String`

Crear un constructor que reciba los tres atributos y los asigne a los atributos de la clase.

Crear una clase `Main` con un método `main` que cree un objeto de tipo `Dog` e imprima sus atributos.

## Ejercicio 2

Crear una clase `Computer` con los siguientes atributos:

- `brand` de tipo `String`
- `model` de tipo `String`
- `ram` de tipo `int`
- `storage` de tipo `int`

Crear un constructor que reciba los cuatro atributos y los asigne a los atributos de la clase.

- Crear metodos para poder imprimir la informacion de la computadora.
- Crear metodos para poder aumentar la memoria ram y el almacenamiento.

## Ejercicio 3

Crear una clase `ComputerStore` con los siguientes atributos:

- `computers` de tipo `ArrayList<Computer>`
- `name` de tipo `String`
- `address` de tipo `String`
- `quantity` de tipo `int`

Crear un constructor que reciba los tres atributos y los asigne a los atributos de la clase.

- Crear un metodo para agregar computadoras a la tienda.
- Crear un metodo para imprimir la informacion de la tienda.
- Crear un metodo para poder vender una computadora.
- Crear un metodo para poder imprimir la cantidad de computadoras en la tienda.
- Crear un metodo para poder filtrar las computadoras con mas de cierta cantidad de memoria ram.

# Ejercicio 4

## Descripción

Este ejercicio tiene como objetivo desarrollar un sistema de biblioteca simple que maneje libros, DVDs y usuarios utilizando principios de programación orientada a objetos como la herencia y el polimorfismo.

## Clases

### `LibraryItem` (ElementoBiblioteca)
- **Descripción**: Clase base para ítems en la biblioteca.
- **Atributos privados**:
    - `title`: Título del ítem.
    - `itemID`: ID único del ítem.
    - `isLoaned`: Indica si el ítem está prestado.
- **Métodos**:
    - Getters y setters para los atributos.
    - `showDetails()`: Método para mostrar los detalles del ítem.

### `Book` (hereda de `LibraryItem`)
- **Descripción**: Representa un libro en la biblioteca.
- **Atributos privados adicionales**:
    - `author`: Autor del libro.
- **Métodos**:
    - Constructores, getters y setters para el nuevo atributo.
    - Sobrescritura del método `showDetails()` para incluir el autor del libro.

### `DVD` (hereda de `LibraryItem`)
- **Descripción**: Representa un DVD en la biblioteca.
- **Atributos privados adicionales**:
    - `director`: Director del DVD.
    - `duration`: Duración del DVD.
- **Métodos**:
    - Constructores, getters y setters para los nuevos atributos.
    - Sobrescritura del método `showDetails()` para incluir el director y la duración.

### `LibraryUser` (UsuarioBiblioteca)
- **Descripción**: Representa a un usuario de la biblioteca.
- **Atributos privados**:
    - `userName`: Nombre del usuario.
    - `userID`: ID del usuario.
    - `loanedItems`: Ítems que el usuario tiene prestados.
- **Métodos**:
    - Getters y setters para los atributos.
    - `showUserDetails()`: Método para mostrar los detalles del usuario.

### `Library` (Biblioteca)
- **Descripción**: Gestiona la colección de ítems de la biblioteca.
- **Atributos**:
    - `libraryItems`: Colección de `LibraryItems`.
- **Métodos**:
    - `addItem()`: Añadir nuevos ítems a la biblioteca.
    - `showAllItems()`: Mostrar todos los ítems de la biblioteca.
    - `loanItem()`: Prestar un ítem a un usuario.
    - `returnItem()`: Devolver un ítem a la biblioteca.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varios libros y DVDs.
- Crear usuarios de la biblioteca.
- Añadir libros y DVDs a la colección de ítems de la biblioteca.
- Prestar y devolver ítems a y de los usuarios.
- Mostrar los detalles de los ítems y los usuarios.

## Instrucciones Adicionales

- Utilice polimorfismo para permitir el préstamo de diferentes tipos de `LibraryItems`.
- Asegúrese de que todas las clases tengan una estructura coherente y métodos bien definidos.
- Escriba el código en el lenguaje Java.

---


## Ejericicio 5

## Descripción

Desarrollar un sistema de gestión para la renta de películas, utilizando principios de programación orientada a objetos como la herencia y el polimorfismo.

## Clases

### `RentalItem`
- **Descripción**: Clase base para ítems en el sistema de renta.
- **Atributos privados**:
  - `itemName`: Nombre del ítem.
  - `itemID`: ID único del ítem.
  - `available`: Atributo que indica si el ítem está disponible para renta.
- **Métodos**:
  - Getters y setters para los atributos.
  - `showDetails()`: Método para mostrar los detalles del ítem.

### `Movie` (hereda de `RentalItem`)
- **Descripción**: Representa una película disponible para renta.
- **Atributos privados adicionales**:
  - `director`: Director de la película.
  - `duration`: Duración de la película.
  - `ageRating`: Clasificación por edades.
  - `genre`: Género de la película.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir detalles adicionales de la película.

### `Customer`
- **Descripción**: Representa a un cliente del sistema de renta.
- **Atributos privados**:
  - `customerName`: Nombre del cliente.
  - `customerID`: ID del cliente.
  - `rentedMovies`: Lista de películas rentadas por el cliente.
- **Métodos**:
  - Getters y setters para los atributos.
  - `showCustomerDetails()`: Método para mostrar los detalles del cliente.

### `MovieRentalSystem`
- **Descripción**: Representa el sistema de renta de películas y maneja todos los ítems de renta.
- **Atributos**:
  - `rentalItems`: Colección de `RentalItems`.
  - `customers`: Lista de clientes registrados.
- **Métodos**:
  - `addItem()`: Añadir nuevos ítems al sistema.
  - `registerCustomer()`: Registrar un nuevo cliente.
  - `rentMovieToCustomer()`: Rentar una película a un cliente.
  - `returnMovie()`: Procesar la devolución de una película rentada.
  - `showAllItems()`: Mostrar todos los ítems disponibles para renta.
  - `showAllCustomers()`: Mostrar todos los clientes registrados.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varias películas.
- Añadir estas películas a la colección de ítems del sistema de renta.
- Registrar clientes en el sistema.
- Desarrollar una interfaz de consola que permita realizar las siguientes operaciones:
  - Rentar películas a los clientes, actualizando su estado `available`.
  - Procesar devoluciones de películas.
  - Mostrar los detalles de películas y clientes.

## Instrucciones Adicionales

- Utilice polimorfismo para manejar los distintos tipos de `RentalItems`.
- Asegúrese de que todas las clases tengan una estructura coherente y métodos bien definidos.
- Escriba el código en el lenguaje de programación Java.


# Ejercicio 6

## Descripción

El objetivo de este ejercicio es desarrollar un sistema de control de inventarios para una tienda, utilizando interfaces para definir comportamientos comunes en diferentes categorías de productos.

## Interfaces

### `InventoryManageable`
- **Descripción**: Interfaz para gestionar las operaciones básicas del inventario.
- **Métodos**:
    - `addItem()`: Añadir un nuevo ítem al inventario.
    - `deleteItem()`: Eliminar un ítem del inventario.
    - `listItems()`: Listar todos los ítems del inventario.
    - `findItemById()`: Buscar un ítem por su ID.

### `Priceable`
- **Descripción**: Interfaz para manejar los precios de los ítems.
- **Métodos**:
    - `getPrice()`: Obtener el precio de un ítem.
    - `setPrice()`: Establecer el precio de un ítem.

## Clases

### `Product` (implementa `Priceable`)
- **Descripción**: Clase abstracta que representa un producto genérico de la tienda.
- **Atributos protegidos**:
    - `productId`: ID único del producto.
    - `price`: Precio del producto.
- **Métodos**:
    - Implementación de los métodos de la interfaz `Priceable`.
    - Otros métodos y atributos comunes a todos los productos.

### `Electronics` (hereda de `Product`, implementa `InventoryManageable`)
- **Descripción**: Representa un producto electrónico.
- **Atributos adicionales**:
    - `brand`: Marca del producto electrónico.
    - `model`: Modelo del producto electrónico.
- **Métodos**:
    - Implementación de los métodos de la interfaz `InventoryManageable`.
    - Constructores, getters y setters para los nuevos atributos.

### `Clothing` (hereda de `Product`, implementa `InventoryManageable`)
- **Descripción**: Representa un producto de ropa.
- **Atributos adicionales**:
    - `size`: Tamaño de la prenda de ropa.
    - `material`: Material de la prenda de ropa.
- **Métodos**:
    - Implementación de los métodos de la interfaz `InventoryManageable`.
    - Constructores, getters y setters para los nuevos atributos.

### `Inventory` (implementa `InventoryManageable`)
- **Descripción**: Gestiona la colección de productos en la tienda.
- **Atributos**:
    - `products`: Lista de productos que implementan `InventoryManageable`.
- **Métodos**:
    - Implementación de los métodos de la interfaz `InventoryManageable`.
    - Métodos para reportes y análisis del inventario.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Crear una instancia de `Inventory`.
- Instanciar varios productos de `Electronics` y `Clothing`.
- Añadir estos productos al inventario.
- Listar todos los productos.
- Buscar un producto por su ID y cambiar su precio.
- Eliminar un producto del inventario.

## Instrucciones Adicionales

- Utilice las interfaces para definir comportamientos comunes y para lograr un bajo acoplamiento.
- Implemente las clases concretas proporcionando funcionalidades específicas.
- Asegúrese de que todas las clases e interfaces tengan una estructura coherente y métodos bien definidos.
- Escriba el código en Java.

# Ejercicio 7

## Descripción

El objetivo de este ejercicio es desarrollar un sistema de matrículas para una institución educativa, utilizando herencia múltiple a través de interfaces. Este sistema deberá gestionar estudiantes, profesores y cursos, permitiendo registrar, matricular y asignar tareas.

## Interfaces

### `Usuario`
- **Descripción**: Interfaz base para todos los usuarios del sistema.
- **Métodos**:
  - `iniciarSesion()`: Permite al usuario iniciar sesión en el sistema.
  - `cerrarSesion()`: Permite al usuario cerrar sesión.

### `Estudiante`
- **Descripción**: Interfaz para los estudiantes.
- **Métodos**:
  - `matricularCurso()`: Permite al estudiante matricularse en un curso.
  - `entregarTarea()`: Permite al estudiante entregar tareas.

### `Profesor`
- **Descripción**: Interfaz para los profesores.
- **Métodos**:
  - `calificarExamen()`: Permite al profesor calificar exámenes.
  - `asignarTarea()`: Permite al profesor asignar tareas.

## Clases

### `Persona` (implementa `Usuario`)
- **Descripción**: Clase base para representar a todos los usuarios.
- **Atributos**:
  - `nombre`: Nombre de la persona.

La forma en la que un usuario se loguea depende de su tipo, por lo que se debe implementar el método `iniciarSesion` de manera diferente en cada subclase.

### `SoloEstudiante` (extiende `Persona`, implementa `Estudiante`)
- **Descripción**: Representa exclusivamente a un estudiante.
- **Atributos**:
    - `cursos`: Lista de cursos en los que está matriculado el estudiante.
- **Métodos**:
  - Implementación de los métodos de la interfaz `Estudiante`.

### `EstudianteProfesor` (extiende `Persona`, implementa `Estudiante`, `Profesor`)
- **Descripción**: Representa a una persona que es tanto estudiante como profesor.
- **Atributos**:
  - `cursos`: Lista de cursos en los que está matriculado el estudiante.
  - `cursosImpartidos`: Lista de cursos que imparte el profesor.
- **Métodos**:
  - Implementación de los métodos de las interfaces `Estudiante` y `Profesor`.

### `SoloProfesor` (extiende `Persona`, implementa `Profesor`)
- **Descripción**: Representa exclusivamente a un profesor.
- **Atributos**:
  - `cursosImpartidos`: Lista de cursos que imparte el profesor.
- **Métodos**:
  - Implementación de los métodos de la interfaz `Profesor`.

### `Curso`
- **Descripción**: Representa un curso en la institución.
- **Atributos**:
  - `nombre`: Nombre del curso.
  - `codigo`: Código del curso.
  - `estudiantes`: Lista de estudiantes en el curso.
- **Métodos**:
  - Métodos para gestionar el curso y sus estudiantes.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Crear instancias de `Persona`, `SoloEstudiante`, `EstudianteProfesor` y `Curso`.
- Utilizar `SoloEstudiante` y `EstudianteProfesor` para matricular a los estudiantes en los cursos y asignar tareas.
- Utilizar `EstudianteProfesor` para realizar acciones de profesor, como calificar exámenes.
- Gestionar las listas de estudiantes en los cursos.
- Demostrar el inicio y cierre de sesión en el sistema por parte de los usuarios.

Este ejercicio proporcionará una comprensión práctica de cómo se puede utilizar la herencia múltiple en Java mediante interfaces para crear un sistema de gestión flexible que abarque múltiples roles y funcionalidades.

# Ejercicio 8

## Descripción

Desarrolla un sistema para gestionar un registro de vehículos, utilizando principios de programación orientada a objetos como la herencia y el polimorfismo.

## Clases

### `Vehicle` (Vehículo)
- **Descripción**: Clase base para vehículos.
- **Atributos privados**:
  - `make`: Marca del vehículo.
  - `model`: Modelo del vehículo.
  - `year`: Año de fabricación.
  - `registrationNumber`: Número de matrícula.
- **Métodos**:
  - Getters y setters para los atributos.
  - `showDetails()`: Método para mostrar los detalles del vehículo.

### `Car` (hereda de `Vehicle`)
- **Descripción**: Representa un automóvil.
- **Atributos privados adicionales**:
  - `seatingCapacity`: Capacidad de asientos.
  - `fuelType`: Tipo de combustible.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir capacidad de asientos y tipo de combustible.

### `Motorcycle` (hereda de `Vehicle`)
- **Descripción**: Representa una motocicleta.
- **Atributos privados adicionales**:
  - `engineSize`: Tamaño del motor.
  - `hasSidecar`: Indica si tiene sidecar.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir tamaño del motor y sidecar.

### `Truck` (hereda de `Vehicle`)
- **Descripción**: Representa un camión.
- **Atributos privados adicionales**:
  - `loadCapacity`: Capacidad de carga.
  - `numberOfAxles`: Número de ejes.
- **Métodos**:
  - Constructores, getters y setters para los nuevos atributos.
  - Sobrescritura del método `showDetails()` para incluir capacidad de carga y número de ejes.

### `VehicleRegistry`
- **Descripción**: Gestiona el registro de vehículos.
- **Atributos**:
  - `registeredVehicles`: Colección de `Vehicles`.
- **Métodos**:
  - `registerVehicle()`: Registrar un nuevo vehículo.
  - `showAllVehicles()`: Mostrar todos los vehículos registrados.
  - `findVehicle()`: Buscar un vehículo por su número de matrícula.

## Funcionalidad Principal

En la clase `Main`, se deberá:

- Instanciar varios coches, motocicletas y camiones.
- Registrar estos vehículos en el `VehicleRegistry`.
- Mostrar los detalles de cada vehículo.
- Buscar vehículos específicos en el registro.

## Instrucciones Adicionales

- Utilice polimorfismo para gestionar diferentes tipos de `Vehicle`.
- Asegúrese de que todas las clases tengan una estructura coherente y métodos bien definidos.
- Escriba el código en el lenguaje Java.

# Ejercicio 9

Este ejercicio implica la creación de un sistema de gestión de personal en una empresa utilizando Java. Se utilizará herencia y polimorfismo para manejar diferentes tipos de empleados y una clase para administrar una lista de estos empleados.

## Clases de Empleados

### Clase Base: Empleado
- Atributos: nombre, ID, departamento.
- Métodos:
  - `mostrar_info()`: Retorna información del empleado.
  - `calcular_salario()`: Calcula el salario (será sobrescrito en subclases).

### Clase Derivada: Desarrollador
- Atributos adicionales: lenguajes de programación.
- Método sobrescrito: `calcular_salario()`.

### Clase Derivada: Gerente
- Atributos adicionales: lista de empleados a cargo.
- Método sobrescrito: `calcular_salario()`.

### Clase Derivada: Diseñador
- Atributos adicionales: tipo de diseño.
- Método sobrescrito: `calcular_salario()`.

## Clase Gestora: Empresa
- Atributos:
  - Lista de empleados.
- Métodos:
  - `añadir_empleado(empleado)`: Añade un empleado a la lista.
  - `eliminar_empleado(id)`: Elimina un empleado por su ID.
  - `mostrar_empleados()`: Muestra información de todos los empleados.