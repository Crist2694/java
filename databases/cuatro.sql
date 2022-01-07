--
Create table Socio(
    idsocio number primary key,
    nombre nvarchar2(100),
    direccion nvarchar2(400),
    telefono nvarchar2(10),
    genero nvarchar2(15)
);
Create table Pelicula(
    idpelicula number primary key,
    nombre nvarchar2(50)
);

Create table Ficha(
    idficha number primary key,
    idpelicula number,
    fecha date,
    idsocio number
);

ALTER TABLE Ficha add constraint Ficha_FK_Socio
FOREIGN KEY (idsocio) REFERENCES Socio (idsocio);
ALTER TABLE Ficha add constraint Ficha_FK_Pelicula
FOREIGN KEY (idpelicula) REFERENCES Pelicula(idpelicula);



Create table Peliculasdevueltas(
    idpeliculasdevueltas number primary key,
    idficha number,
    fecha date
);

ALTER TABLE Peliculasdevueltas add constraint Peliculasdevueltas_FK_Ficha
FOREIGN KEY (idficha) REFERENCES Ficha(idficha);


create table Listaespera(
    idlistaespera number primary key,
    idsocio number,
    idpelicula number,
    estado nvarchar2(10)
);

ALTER TABLE Listaespera add constraint Listaespera_FK_Socio
FOREIGN KEY (idsocio) REFERENCES Socio(idsocio);
ALTER TABLE Listaespera add constraint Listaespera_FK_Pelicula
FOREIGN KEY (idpelicula) REFERENCES Pelicula(idpelicula);

create table Actor(
    idactor number primary key,
    nombre nvarchar2(100)
);

create table Genero(
    idgenero number primary key,
    nombre nvarchar2(100)
);
create table Director(
    iddirector number primary key,
    nombre nvarchar2(100)
);

create table Archivadorpeliculas(
    idarchivadorpeliculas number primary key,
    idpelicula number,
    idactor number,
    idgenero number,
    iddirector number
);

ALTER TABLE Archivadorpeliculas add constraint Archivpeli_FK_Pelicula
FOREIGN KEY (idpelicula) REFERENCES Pelicula(idpelicula);
ALTER TABLE Archivadorpeliculas add constraint Archivpeli_FK_Actor
FOREIGN KEY (idactor) REFERENCES Actor(idactor);
ALTER TABLE Archivadorpeliculas add constraint Archivpeli_FK_Genero
FOREIGN KEY (idgenero) REFERENCES Genero(idgenero);
ALTER TABLE Archivadorpeliculas add constraint Archivpeli_FK_Director
FOREIGN KEY (iddirector) REFERENCES Director(iddirector);


Create sequence Socio_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_SOCIO BEFORE
INSERT ON Socio FOR EACH ROW BEGIN
SELECT Socio_SEQ.NEXTVAL INTO :new.idsocio FROM dual;
END;

Create sequence Pelicula_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_PELICULA BEFORE
INSERT ON Pelicula FOR EACH ROW BEGIN
SELECT Pelicula_SEQ.NEXTVAL INTO :new.idpelicula FROM dual;
END;

Create sequence Ficha_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_FICHA BEFORE
INSERT ON Ficha FOR EACH ROW BEGIN
SELECT Ficha_SEQ.NEXTVAL INTO :new.idficha FROM dual;
END;

Create sequence Peliculasdevueltas_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_Peliculasdevueltas BEFORE
INSERT ON Peliculasdevueltas FOR EACH ROW BEGIN
SELECT Peliculasdevueltas_SEQ.NEXTVAL INTO :new.idpeliculasdevueltas FROM dual;
END;

Create sequence Listaespera_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_Listaespera BEFORE
INSERT ON Listaespera FOR EACH ROW BEGIN
SELECT Listaespera_SEQ.NEXTVAL INTO :new.idlistaespera FROM dual;
END;

Create sequence Actor_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_Actor BEFORE
INSERT ON Actor FOR EACH ROW BEGIN
SELECT Actor_SEQ.NEXTVAL INTO :new.idactor FROM dual;
END;

Create Sequence Genero_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_Genero BEFORE
INSERT ON Genero FOR EACH ROW BEGIN
SELECT Genero_SEQ.NEXTVAL INTO :new.idgenero FROM dual;
END;

Create Sequence Director_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_Director BEFORE
INSERT ON Director FOR EACH ROW BEGIN
SELECT Director_SEQ.NEXTVAL INTO :new.iddirector FROM dual;
END;

Create Sequence Archivadorpeliculas_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_Archivpeli BEFORE
INSERT ON Archivadorpeliculas FOR EACH ROW BEGIN
SELECT Archivadorpeliculas_SEQ.NEXTVAL INTO :new.idarchivadorpeliculas FROM dual;
END;

INSERT ALL
INTO Socio(nombre, direccion, telefono, genero)
values ('Cristian', 'E.S', '2224356771', 'Terror')
INTO Socio(nombre, direccion, telefono, genero)
values ('Crisostomo', 'Agripino', '2221142056', 'Drama')
INTO Socio(nombre, direccion, telefono, genero)
values ('Mariana', 'Herrera', '2224005467', 'Thriller')
select * from dual;

select * from Socio;

INSERT ALL
INTO Pelicula(nombre)
values('Spiderman')
INTO Pelicula(nombre)
values('Batman')
INTO Pelicula(nombre)
values('Superman')
select * from dual;

select * from Pelicula;
 
INSERT ALL
INTO Ficha (idpelicula, fecha, idsocio)
values (1, '10-12-2021', 1 )
INTO Ficha (idpelicula, fecha, idsocio)
values (2, '11-12-2021', 2 )
INTO Ficha (idpelicula, fecha, idsocio)
values (3, '11-12-2021', 3 )
select * from dual;
 
select * from Ficha; 

INSERT ALL
INTO Peliculasdevueltas (idficha, fecha)
values (1, '11-12-2021')
INTO Peliculasdevueltas (idficha, fecha)
values (2, '12-12-2021')
INTO Peliculasdevueltas (idficha, fecha)
values (3, '13-12-2021')
select * from dual;
 
select * from Peliculasdevueltas;

INSERT ALL
INTO Listaespera (idsocio, idpelicula, estado)
values (1,2,'En espera')
INTO Listaespera (idsocio, idpelicula, estado)
values (2,3,'En espera')
INTO Listaespera (idsocio, idpelicula, estado)
values (3,3,'Entregado')
select * from dual;

Select * from Listaespera;

INSERT ALL
INTO Actor(nombre)
values ('Julia Roberts')
INTO Actor(nombre)
values ('Gal Gadot')
INTO Actor(nombre)
values ('Sandra Bullok')
select * from dual;

select * from Actor;

INSERT ALL
INTO Genero(nombre)
values ('Terror')
INTO Genero(nombre)
values ('Accion')
INTO Genero(nombre)
values ('Dorama')
select * from dual;

select * from Genero;

INSERT ALL
INTO Director(nombre)
values('Mel Gibson')
INTO Director(nombre)
values('Guillermo del Toro')
INTO Director(nombre)
values('Spielber')
select * from dual;

select * from Director;

INSERT ALL
INTO Archivadorpeliculas ( idpelicula, idactor, idgenero, iddirector)
values(1,1,1,1)
INTO Archivadorpeliculas ( idpelicula, idactor, idgenero, iddirector)
values(2,2,2,2)
INTO Archivadorpeliculas ( idpelicula, idactor, idgenero, iddirector)
values(3,3,3,3)
select * from dual;


select * from Archivadorpeliculas;


select Pelicula.nombre as Pelicula, Actor.nombre as Estelar, Genero.nombre as Genero, Director.nombre as Director  from Actor, Genero, Director, Pelicula
where Actor.idactor=1 and Genero.idgenero=1 and Director.iddirector=1 and Pelicula.idpelicula=1;

Select * from Archivadorpeliculas where idarchivadorpeliculas=1;

commit;
