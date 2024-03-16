-- Creación de la tabla 'aerolineas' para almacenar información sobre las aerolíneas.
create table if not exists aerolineas(
	id_aerolinea serial primary key, -- Identificador único de la aerolínea (autoincremental).
	nombre varchar(40) -- Nombre de la aerolínea.
);

-- Creación de la tabla 'aviones' para almacenar información sobre los aviones.
create table if not exists aviones (
	id_avion serial primary key, -- Identificador único del avión (autoincremental).
	capacidad smallint, -- Capacidad máxima de pasajeros del avión.
	peso smallint, -- Peso del avión.
	modelo varchar(20), -- Modelo del avión.
	id_aerolinea_fk integer, -- Clave foránea que referencia a la tabla 'aerolineas'.

	-- Restricción de clave foránea que referencia a la tabla 'aerolineas'.
	foreign key(id_aerolinea_fk) 
		references aerolineas(id_aerolinea)
);

-- Creación de la tabla 'vuelos' para almacenar información sobre los vuelos.
create table vuelos (
	id_vuelo serial primary key, -- Identificador único del vuelo (autoincremental).
	fecha_salida date, -- Fecha de salida del vuelo.
	fecha_llegada date, -- Fecha de llegada del vuelo.
	origen varchar(50), -- Lugar de origen del vuelo.
	destino varchar(50), -- Lugar de destino del vuelo.
	id_avion_fk integer, -- Clave foránea que referencia a la tabla 'aviones'.

	-- Restricción de clave foránea que referencia a la tabla 'aviones'.
	foreign key(id_avion_fk)
		references aviones(id_avion)
);

-- Creación de la tabla 'boletos' para almacenar información sobre los boletos de vuelo.
create table if not exists boletos(
	id_boleto serial primary key, -- Identificador único del boleto (autoincremental).
	asiento smallint -- Número de asiento del boleto.
);

-- Creación de la tabla 'pasajeros' para almacenar información sobre los pasajeros.
create table if not exists pasajeros(
	id_pasajero serial primary key, -- Identificador único del pasajero (autoincremental).
	nombre varchar(40), -- Nombre del pasajero.
	apellido varchar(40) -- Apellido del pasajero.
);

-- Creación de la tabla 'pilotos' para almacenar información sobre los pilotos.
create table if not exists pilotos(
	id_piloto serial primary key, -- Identificador único del piloto (autoincremental).
	nombre varchar(40), -- Nombre del piloto.
	apellido varchar(40), -- Apellido del piloto.
	estado boolean -- Estado del piloto.
);

-- Creación de la tabla de relación entre vuelos y pilotos.
create table if not exists vuelo_piloto(
	id_vuelo_fk integer, -- Clave foránea que referencia al vuelo.
	id_piloto_fk integer -- Clave foránea que referencia al piloto.
);

-- Modificación de la tabla 'boletos' para agregar una columna que referencie a la tabla 'pasajeros'.
alter table boletos add column id_pasajero_fk integer;

-- Restricción de clave foránea que referencia a la tabla 'pasajeros'.
alter table boletos 
	add constraint id_pasajero_fk 
	foreign key(id_pasajero_fk) 
	references pasajeros(id_pasajero);

-- Modificación de la tabla 'boletos' para agregar una columna que referencie a la tabla 'vuelos'.
alter table boletos add column id_vuelo_fk integer;

-- Restricción de clave foránea que referencia a la tabla 'vuelos'.
alter table boletos 
	add constraint id_vuelos_fk 
	foreign key(id_vuelo_fk) 
	references vuelos(id_vuelo);

-- Modificación de la tabla 'vuelo_piloto' para agregar columnas que referencien a las tablas 'vuelos' y 'pilotos'.
alter table vuelo_piloto add column id_vuelo_fk integer;
alter table vuelo_piloto add column id_piloto_fk integer;

-- Restricción de clave foránea que referencia a la tabla 'vuelos'.
alter table vuelo_piloto 
	add constraint id_vuelos_fk 
	foreign key(id_vuelo_fk) 
	references vuelos(id_vuelo);

-- Restricción de clave foránea que referencia a la tabla 'pilotos'.
alter table vuelo_piloto 
	add constraint id_pilotos_fk 
	foreign key(id_piloto_fk) 
	references pilotos(id_piloto);

-- Modificación de la tabla 'aerolineas' para aumentar el tamaño del campo 'nombre'.
alter table aerolineas 
	alter column nombre 
	set data type varchar(100);
