create table if not exists aerolineas(
	id_aerolinea serial primary key,
	nombre varchar(100)
);

/*insert into aerolineas(nombre) values('Latam-Airlines');
insert into aerolineas(nombre) values('Sky-Airlines');

select * from aerolineas;

select nombre from aerolineas;*/

create table if not exists aviones (
	id_avion serial primary key,
	capacidad smallint,
	peso smallint,
	modelo varchar(100),

	id_aerolinea_fk integer,

	foreign key(id_aerolinea_fk) 
		references aerolineas(id_aerolinea)
);

create table vuelos (
	id_vuelo serial primary key,
	fecha_salida date,
	fecha_llegada date,
	origen varchar(100),
	destino varchar(100),

	id_avion_fk integer,

	foreign key(id_avion_fk)
		references aviones(id_avion)
);

create table if not exists boletos(
	id_boleto serial primary key,
	asiento smallint
);

create table if not exists pasajeros(
	id_pasajero serial primary key,
	nombre varchar(100),
	apellido varchar(100)
);

create table if not exists pilotos(
	id_piloto serial primary key,
	nombre varchar(100),
	apellido varchar(100),
	estado boolean
);
create table if not exists vuelo_piloto()


alter table boletos add column id_pasajero_fk integer;
	
alter table boletos 
	add constraint id_pasajero_fk 
	foreign key(id_pasajero_fk) 
	references pasajeros(id_pasajero);


alter table boletos add column id_vuelo_fk integer;

alter table boletos 
	add constraint id_vuelos_fk 
	foreign key(id_vuelo_fk) 
	references vuelos(id_vuelo);

alter table vuelo_piloto add column id_vuelo_fk integer;
alter table vuelo_piloto add column id_piloto_fk integer;

alter table vuelo_piloto 
	add constraint id_vuelos_fk 
	foreign key(id_vuelo_fk) 
	references vuelos(id_vuelo);

alter table vuelo_piloto 
	add constraint id_pilotos_fk 
	foreign key(id_piloto_fk) 
	references pilotos(id_piloto);

alter table aerolineas 
	alter column nombre 
	set data type varchar(100);