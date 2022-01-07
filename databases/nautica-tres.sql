-- nautica

create table Patron(
    idpatron number PRIMARY KEY,
    nombre nvarchar2(100),
    direccion nvarchar2(40),
    edad number
);

insert into Patron (idpatron, nombre, direccion, edad)
values (1, 'Crisostomo', 'Enrique segoviano', 18);
select * from Patron;

create table Socio (
    idsocio number PRIMARY KEY,
    nombre nvarchar2(100),
    direccion nvarchar2(40),
    edad number,
    idpatron number
);

insert into Socio(idsocio, nombre, direccion, edad, idpatron)
values(1, 'Susana', 'Oria', 25, 1);
select * from socio;


create table Barco(
    idbarco number PRIMARY KEY,
    nombre nvarchar2(100),
    matricula nvarchar2(10),
    numero_del_amarre number,
    cuota number,
    idsocio number
);

insert into Barco (idbarco, nombre, matricula, numero_del_amarre, cuota, idsocio)
values (1, 'Perla', ' Perl4 ', 4, 1500, 2 );
Select * from Barco;


create table Salidas(
    idsalidas number PRIMARY KEY,
    fecha_hora date,
    destino nvarchar2(100),
    idbarco number
);

insert into Salidas (idsalidas, fecha_hora, destino, idbarco)
values (1, '15-05-2021', 'tu corazon', 4);
select * from Salidas;


---las llaves foraneas

ALTER TABLE Socio ADD CONSTRAINT Socio_FK_Patron
FOREIGN KEY (idpatron) REFERENCES Patron (idpatron);

ALTER TABLE Barco ADD CONSTRAINT Barco_FK_Socio
FOREIGN KEY (idsocio) REFERENCES Socio (idsocio);

ALTER TABLE Salidas ADD CONSTRAINT Salidas_FK_Barco
FOREIGN KEY (idbarco) REFERENCES Barco (idbarco);

-- tabla patron
--secuencia
    CREATE SEQUENCE Patron_SEQ;
--trigger
CREATE OR REPLACE TRIGGER ON_INSERT_PATRON BEFORE
INSERT ON Patron FOR EACH ROW BEGIN
SELECT Patron_SEQ.NEXTVAL INTO :new.idpatron FROM dual;
END;

--tabla socio
    CREATE SEQUENCE Socio_SEQ;
--TRIGGER
CREATE OR REPLACE TRIGGER ON_INSERT_SOCIO BEFORE
INSERT ON Socio FOR EACH ROW BEGIN
SELECT Socio_SEQ.NEXTVAL INTO :new.idsocio FROM dual;
END;


--tabla barco
CREATE SEQUENCE Barco_SEQ;
--trigger
CREATE OR REPLACE TRIGGER ON_INSERT_BARCO BEFORE
INSERT ON Barco FOR EACH ROW BEGIN
SELECT Barco_SEQ.NEXTVAL INTO :new.idbarco FROM dual;
END;

--tabla salida
CREATE SEQUENCE Salida_SEQ;
--trigger
CREATE OR REPLACE TRIGGER ON_INSERT_SALIDA BEFORE
INSERT ON Salidas FOR EACH ROW BEGIN
SELECT Salida_SEQ.NEXTVAL INTO :new.idsalidas FROM dual;
END;



--INSERCION DE REGISTROS USANDO EL TRIGGER Y SECUENCIA
--tabla patron
INSERT ALL
INTO Patron (nombre, direccion, edad)
VALUES ('Cris', 'Antemo', 25)
INTO Patron (nombre, direccion, edad)
VALUES ('Anthuan', 'Griezman', 32)
INTO Patron (nombre, direccion, edad)
VALUES ('Mariana', 'Herrera', 26)
SELECT * FROM DUAL;

select * from Patron;

--tabla Socio
INSERT ALL
INTO Socio (nombre, direccion, edad, idpatron)
values ('Yanin', 'Campos', 31,2)
INTO Socio (nombre, direccion, edad, idpatron)
values ('Tomas', 'Tellez', 62,3)
INTO Socio (nombre, direccion, edad, idpatron)
values ('Crisostomo', 'Agripino', 20,1)
SELECT * FROM DUAL;

SELECT * FROM Socio;

-- tabla barco
INSERT ALL
INTO Barco (nombre, matricula, numero_del_amarre, cuota, idsocio)
values('Fodonga', '00as0', 3, 2000, 3)
INTO Barco (nombre, matricula, numero_del_amarre, cuota, idsocio)
values('Casimira', 'casi0001', 2, 2500, 4)
INTO Barco (nombre, matricula, numero_del_amarre, cuota, idsocio)
values('La reina', '666RRR', 1, 3000, 1)
SELECT * FROM DUAL;

select * from Barco;

--tabla salidas
INSERT ALL
INTO Salidas(fecha_hora, destino, idbarco)
values ('28-12-2021', 'Reinosa', 3)
INTO Salidas(fecha_hora, destino, idbarco)
values ('30-10-2021', 'Nunca jamas', 2)
INTO Salidas(fecha_hora, destino, idbarco)
values ('14-02-2021', 'Holanda', 1)
select * from dual;

select * from Salidas;

commit;
