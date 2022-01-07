--- ejercicio 4

Create table Socio(
    id_socio number primary key,
    codigo nvarchar2(10),
    nombre nvarchar2(100),
    direccion nvarchar2(40),
    telefono nvarchar2(10),
    genero_preferido nvarchar2(40)
);

insert into Socio(id_socio, codigo, nombre, direccion, telefono, genero_preferido)
values(2, '455', 'Cristian ', 'Enrique ', 1212, 'Terror' );

select * from Socio;
delete * from Socio;
Alter table Socio 
modify ( nombre nvarchar2(40));


Create table Ficha(
    id_ficha number primary key,
    id_pelicula number,
    fecha date,
    id_socio number
);

insert into Ficha(id_ficha, id_pelicula, fecha, id_socio)
values(3, 1, '10-12-2021', 1);
select * from ficha;

Create table Pelicula(
    id_pelicula number primary key,
    nombre nvarchar2(100)
);

insert into Pelicula(id_pelicula, nombre)
values(2, 'Spiderman');
select * from pelicula;

Create table Peliculas_devueltas(
    id_peliculas_devueltas number primary key,
    id_ficha number,
    fecha date
);

insert into Peliculas_devueltas(id_peliculas_devueltas, id_ficha, fecha)
values(1, 1, '29-12-2021');
select * from Peliculas_devueltas;

Create table lista_espera(
    id_lista_espera number primary key,
    id_socio number,
    id_pelicula number,
    estado nvarchar2(10)
);

select * from pelicula, socio;
insert into lista_espera(id_lista_espera, id_socio, id_pelicula, estado)
values(1, 2, 1, 'esperando');


Create table archivador_peliculas(
    id_archivador_peliculas number primary key,
    id_pelicula number,
    id_actor number,
    id_genero number,
    id_director number
);

Create table Actor(
    id_actor number primary key,
    nombre number
);


Create table Genero(
    id_genero number primary key,
    nombre number
);


Create table Director(
    id_director number primary key,
    nombre number
);


--foreign keys

ALTER TABLE Ficha ADD CONSTRAINT Ficha_FK_Socio
FOREIGN KEY (id_socio) REFERENCES Socio (id_socio);

ALTER TABLE Ficha ADD CONSTRAINT Ficha_FK_Pelicula
FOREIGN KEY (id_pelicula) REFERENCES Pelicula (id_pelicula);

ALTER TABLE Peliculas_devueltas ADD CONSTRAINT Peliculas_devueltas_FK_Ficha
FOREIGN KEY (id_ficha) REFERENCES Ficha (id_ficha);

ALTER TABLE lista_espera ADD CONSTRAINT lista_espera_FK_Socio
FOREIGN KEY (id_socio) REFERENCES Socio (id_socio);

ALTER TABLE lista_espera ADD CONSTRAINT lista_espera_FK_Pelicula
FOREIGN KEY (id_pelicula) REFERENCES Pelicula (id_pelicula);

ALTER TABLE archivador_peliculas ADD CONSTRAINT archivador_peliculas_FK_Actor
FOREIGN KEY (id_actor) REFERENCES Actor (id_actor);

ALTER TABLE archivador_peliculas ADD CONSTRAINT archivador_peliculas_FK_Genero
FOREIGN KEY (id_genero) REFERENCES Genero (id_genero);

ALTER TABLE archivador_peliculas ADD CONSTRAINT archiv_peli_FK_Director
FOREIGN KEY (id_director) REFERENCES Director (id_director);


CREATE SEQUENCE Socio_SEQ;


--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_Socio BEFORE
INSERT ON Socio FOR EACH ROW BEGIN
SELECT Socio_SEQ.NEXTVAL INTO :new.id_socio FROM dual;
END;


CREATE SEQUENCE Fichaa_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_Ficha BEFORE
INSERT ON Ficha FOR EACH ROW BEGIN
SELECT Fichaa_SEQ.NEXTVAL INTO :new.id_ficha FROM dual;
END;

CREATE SEQUENCE Peliculaas_devueltas_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_Peliculas_devueltas BEFORE
INSERT ON Peliculas_devueltas FOR EACH ROW BEGIN
SELECT Peliculaas_devueltas_SEQ.NEXTVAL INTO :new.id_peliculas_devueltas FROM dual;
END;


CREATE SEQUENCE lista_espera_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_lista_espera BEFORE
INSERT ON lista_espera FOR EACH ROW BEGIN
SELECT lista_espera_SEQ.NEXTVAL INTO :new.id_lista_espera FROM dual;
END;

CREATE SEQUENCE archivador_peliculas_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_archivador_peliculas BEFORE
INSERT ON archivador_peliculas FOR EACH ROW BEGIN
SELECT archivador_peliculas_SEQ.NEXTVAL INTO :new.id_archivador_peliculas FROM dual;
END;

CREATE SEQUENCE Actor_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_Actor BEFORE
INSERT ON Actor FOR EACH ROW BEGIN
SELECT Actor_SEQ.NEXTVAL INTO :new.id_actor FROM dual;
END;

CREATE SEQUENCE Genero_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_Genero BEFORE
INSERT ON Genero FOR EACH ROW BEGIN
SELECT Genero_SEQ.NEXTVAL INTO :new.id_genero FROM dual;
END;

CREATE SEQUENCE Director_SEQ;

--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_Director BEFORE
INSERT ON Director FOR EACH ROW BEGIN
SELECT Director_SEQ.NEXTVAL INTO :new.id_director FROM dual;
END;


INSERT ALL
INTO Socio(codigo, nombre, direccion, telefono, genero_preferido)
VALUES('85ese6', 'Crisostomo', 'Agripino', 21210212, 'Comedia')
INTO Socio(codigo, nombre, direccion, telefono, genero_preferido)
VALUES('96isi7', 'Francisco', 'Montes', 21210212, 'Terror')
INTO Socio(codigo, nombre, direccion, telefono, genero_preferido)
VALUES('90oso8', 'Juan', 'Escutia', 21210212, 'Thriller')
SELECT * FROM DUAL;

select * from socio;

INSERT ALL
INTO Pelicula(nombre)
VALUES('Batman')
INTO Pelicula(nombre)
VALUES('Superman')
INTO Pelicula(nombre)
VALUES('Nacho')
select * from dual;

select * from pelicula;
truncate table pelicula;

INSERT ALL
INTO Ficha(id_pelicula, fecha, id_socio)
VALUES(1, '10-12-2021', 1)
INTO Ficha(id_pelicula, fecha, id_socio)
VALUES(5, '18-12-2021', 1)
INTO Ficha(id_pelicula, fecha, id_socio)
VALUES(5, '18-12-2021', 1)
SELECT * FROM DUAL;

select * from ficha;
drop table ficha;
INSERT ALL
INTO Peliculas_devueltas(id_ficha, fecha)
values(1, '29-12-2021')
INTO Peliculas_devueltas(id_ficha, fecha)
values(4, '17-12-2021')
INTO Peliculas_devueltas(id_ficha, fecha)
values(6, '20-12-2021')
select * from dual;

select * from Peliculas_devueltas;

truncate table Peliculas_devueltas;
