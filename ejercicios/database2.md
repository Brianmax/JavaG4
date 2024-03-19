# Optimizando la Gestión de Investigación.

En nuestra institución, nos dedicamos a la investigación en diversos campos científicos. Para optimizar nuestra gestión de investigación, hemos identificado la necesidad de una base de datos que nos permita rastrear de manera efectiva la información relacionada con nuestros departamentos, investigadores y proyectos.

## Contexto:

Actualmente, nos enfrentamos a dificultades para mantener un registro claro de quién está involucrado en qué proyectos y en qué departamento se llevan a cabo esos proyectos. Además, la gestión de la relación entre investigadores y proyectos se ha vuelto complicada debido a la falta de un sistema centralizado y eficiente.

## Solicitud del Cliente:

Por lo tanto, estamos buscando desarrollar una base de datos que nos ayude a:

1. **Registrar Departamentos:** Necesitamos un sistema que nos permita mantener un registro de todos nuestros departamentos. Cada departamento debe tener un nombre único y un identificador único.

2. **Gestionar Investigadores:** Es crucial para nosotros tener información detallada sobre nuestros investigadores. Cada investigador debe estar asociado a un departamento específico, lo que nos permite rastrear su afiliación institucional.

3. **Seguir Proyectos de Investigación:** Queremos poder registrar todos nuestros proyectos de investigación. Cada proyecto debe tener un nombre único y estar vinculado a un departamento particular.

4. **Gestionar la Relación Investigadores-Proyectos:** Dado que nuestros investigadores pueden participar en múltiples proyectos y un proyecto puede involucrar a varios investigadores, necesitamos una manera efectiva de gestionar esta relación. Queremos poder rastrear qué investigadores están involucrados en qué proyectos y viceversa.

## Formas de Eliminación:

En cuanto a la eliminación de registros, necesitamos considerar las siguientes formas:

1. **Eliminación de Departamentos:** Si eliminamos un departamento, queremos definir que todos los investigadores asociados a ese departamento sean actualizados para que su campo `id_departamento` se establezca en `NULL`. Además, queremos que todos los proyectos asociados a ese departamento se eliminen automáticamente.

2. **Eliminación de Investigadores:** Si eliminamos un investigador, queremos que se eliminen todas las entradas en la tabla `Investigadores_Proyectos` que estén relacionadas con ese investigador.

3. **Eliminación de Proyectos:** Si eliminamos un proyecto, queremos que se eliminen todas las entradas en la tabla `Investigadores_Proyectos` que estén relacionadas con ese proyecto.