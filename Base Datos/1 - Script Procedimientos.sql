
//*************** consultas A ********************//
/*Todos los equipos por confederacion*/
create or replace procedure ParConf( p_cur out sys_refcursor) AS
begin
   open p_cur for
   select * from Equipo order by codigoConfederacion;
end ParConf;

/*muestra los esquipos de una confederacion dada*/
create or replace procedure EquiposParConf( codigo in Equipo.codigoConfederacion%Type, p_cur out sys_refcursor) AS
begin
   open p_cur for
   select * from Equipo where codigo = codigoConfederacion;
end EquiposParConf;

/***********************************/

/*insertarConfederacion*/
create or replace procedure insConf( codigo in varchar2, nomb in varchar2) AS
begin
  Insert into Confederacion(codigoConfederacion,nombre)
  values(codigo,nomb);
end insConf;

/******/

//************** Consultas B *************//
 /*Datos de partido*/ 
create or replace procedure datosPartido(p_numero_partido in Partido.numeropartido%TYPE ,p_etapa out Partido.etapa%TYPE, p_fecha out Partido.fecha%TYPE, p_hora out Partido.hora%TYPE,p_cantidad_aficionados out Partido.cantidad_aficionados%TYPE,p_min_reposicion_tiempo1 out Partido.min_reposicion_tiempo1%TYPE,p_min_reposicion_tiempo2 out Partido.min_reposicion_tiempo2%TYPE ) AS
begin
  select etapa,fecha,hora,cantidad_aficionados,min_reposicion_tiempo1,min_reposicion_tiempo2 into p_etapa,p_fecha,p_hora,p_cantidad_aficionados,p_min_reposicion_tiempo1,p_min_reposicion_tiempo2 from Partido where numeropartido = p_numero_partido;
end datosPartido;

 /*Titulares partido*/
create or replace procedure titularesPartidos( p_numero_partido in Partido.numeropartido%TYPE , respuesta out Persona.nombre%Type) AS
begin
  select p.nombre into respuesta from Persona p, Titulares t  where t.numeropartido = p_numero_partido and t.numeroPasaporte = p.numeropasaporte;
end titularesPartidos;

 /*Suplentes partido*/
create or replace procedure suplentesPartidos(  p_numero_partido in Partido.numeropartido%TYPE , respuesta out Persona.nombre%Type) AS
begin
  select p.nombre into respuesta from Persona p, Suplentes s  where s.numeropartido = p_numero_partido and s.numeropasaporte = p.numeropasaporte;
end suplentesPartidos;

/*Albritos partido*/
create or replace procedure supervisoresPartidos(  p_numero_partido in Partido.numeropartido%TYPE , p_tipo out supervisa.tipo%TYPE  ,nombre out Persona.nombre%Type) AS
begin
  select p.nombre, s.tipo into nombre , p_tipo from Persona p, Supervisa s where s.numeropartido = p_numero_partido and s.numeroPasaporte = p.numeroPasaporte;
end supervisoresPartidos;

/*Goles y tarjetas*/
create or replace procedure GolesTarjetas(  p_numero_partido in Partido.numeropartido%TYPE , p_tipo out Estadisticas.tipo%TYPE , p_minuto out Estadisticas.minuto%TYPE ,nombre out Persona.nombre%Type) AS
begin
  select p.nombre, E.tipo, E.minuto into nombre , p_tipo , p_minuto from Persona p, Estadisticas E  where E.numeropartido = p_numero_partido and E.numeroPasaporte = p.numeroPasaporte;
end GolesTarjetas;

 /*cambios partido*/
create or replace procedure suplentesPartidos(  p_numero_partido in Partido.numeropartido%TYPE , respuesta out Persona.nombre%Type) AS
begin
  select p.nombre into respuesta from Persona p, Cambios s  where s.numeropartido = p_numero_partido and s.numeropasaporte = p.numeropasaporte;
end suplentesPartidos;

 /*Delegados*/
create or replace procedure delegadosPartidos(  p_numero_partido in Partido.numeropartido%TYPE , respuesta out Persona.nombre%Type) AS
begin
  select p.nombre into respuesta from Persona p, delegado s  where s.numeropartido = p_numero_partido and s.numeropasaporte = p.numeropasaporte;
end delegadosPartidos;

 /*Medico*/
create or replace procedure MedicosPartidos(  p_numero_partido in Partido.numeropartido%TYPE , respuesta out Persona.nombre%Type) AS
begin
  select p.nombre into respuesta from Persona p, Medico s  where s.numeropartido = p_numero_partido and s.numeropasaporte = p.numeropasaporte;
end MedicosPartidos;

 /*Medico*/
create or replace procedure TecnicosPartidos(  p_numero_partido in Partido.numeropartido%TYPE , respuesta out Persona.nombre%Type) AS
begin
  select p.nombre into respuesta from Persona p, CuerpoTecnico s  where s.numeropartido = p_numero_partido and s.numeropasaporte = p.numeropasaporte;
end TecnicosPartidos;

/**Vista que regresa los numeros de partido**/
CREATE OR REPLACE FORCE VIEW "Partidos" ("NUMEROPARTIDO") AS 
  SELECT numeropartido
  FROM partido;

//*********************** Consultas C ****************************//

create or replace procedure PartidosJugados( codp in Equipo.codigopais%Type, p_cur out sys_refcursor) AS
begin
   
   select count( J.codigo_pais)   
   from Juegan J 
   where codp = J.codigo_pais; 
 
end PartidosJugados;

create or replace procedure GolesFavor( codp in Equipo.codigopais%Type, p_cur out sys_refcursor) AS
begin
   
   select sum( E.tipo)   
   from Juegan J, Estadisticas E
   where codp = J.codigo_pais and E.tipo = 'gol' and J.numeropartido = E.numeropartido; 
 
end GolesFavor;

create or replace procedure GolesContra( codp in Equipo.codigopais%Type, p_cur out sys_refcursor) AS
begin
   
   select sum( E.tipo)   
   from Juegan J, Estadisticas E
   where codp <> J.codigo_pais and E.tipo = 'gol' and J.numeropartido = E.numeropartido; 
 
end GolesContra;


/******************** Consulta D *****************************/

/******************** Consulta E *****************************/
create or replace procedure goleadores( nombre out varchar2,nombre2  out varchar2, gols out number) AS
begin
   select P.nombre, E.nombre , Count(S.tipo) "goles" into nombre, nombre2, gols
   from Estadisticas S, Equipo E, Persona P
   where S.tipo = 'gol' and S.numeropasaporte = P.numeropasaporte and P.codigopais = E.codigopais
   order by E.nombre;
end goleadores;

/*************** Dicionario de datos ***************/
create or replace procedure DicionarioD( p_cur out sys_refcursor) AS
begin      
    open p_cur for
    select * from user_tables;
end DicionarioD;

create or replace procedure DicionarioD2(nombre in varchar2 ,p_cur out sys_refcursor) AS
begin      
    
    desc(nombre);
end DicionarioD2;

/****  Todos los equipos por confederacion  ****/
create or replace procedure Grupos( grupoConsulta in Equipo.grupo%Type, p_cur out sys_refcursor) AS
begin
   open p_cur for
   select * from Equipo where grupo = grupoConsulta;
end Grupos;

