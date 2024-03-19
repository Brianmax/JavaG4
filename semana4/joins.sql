select nombre from aerolineas;

select nombre from aerolineas where nombre ilike 'Robel%';

select count(*) from aerolineas;


-- group by
select * from aviones;
select modelo from aviones group by modelo;

select modelo, count(*) from aviones group by modelo order by modelo asc;

-- seleccionar aviones y agruparlos por aerolinea

select id_aerolinea_fk, count(*) 
	from aviones group by id_aerolinea_fk order by count desc;


select aviones.*, aerolineas.nombre 
	from aviones join aerolineas 
	on aviones.id_aerolinea_fk = aerolineas.id_aerolinea;

-- seleccionar vuelos con sus aviones

select * from vuelos v join aviones a on v.id_avion_fk = a.id_avion;

-- seleccionar vuelos con sus aviones y sus respectivas aerolineas

select * from vuelos v 
	join aviones a on v.id_avion_fk = a.id_avion
	join aerolineas ar on ar.id_aerolinea = id_aerolinea_fk;
