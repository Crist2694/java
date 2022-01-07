--ejercicio 5

Create table Base(
    idbase number primary key,
    nombre nvarchar2(40)
);

Create table Avion(
    idavion number primary key,
    codigo nvarchar2(10),
    tipo nvarchar2(50),
    ---
    idbase number
);

alter table Avion add constraint  Avion_FK_Base
foreign key(idbase) references Base (idbase);


Create table Persona(
    idpersona number primary key,
    nombre nvarchar2(50)
);

Create table Piloto(
    idpiloto number primary key,
    nombre nvarchar2(50),
    hrs_vuelo number
);

Create table Miembros(
    idmiembros number primary key,
    nombre nvarchar2(50)
);

Create table Vuelo(
    idvuelo number primary key,
    num_vuelo nvarchar2(10),
    origen nvarchar2(50),
    destino nvarchar2(50),
    fecha date,
    hora nvarchar2(10),
    ---
    idpiloto number,
    idmiembros number,
    idavion number
);

Alter table Vuelo add constraint Vuelo_FK_Piloto
Foreign key (idpiloto) references Piloto (idpiloto);

Alter table Vuelo add constraint Vuelo_FK_Miembros
Foreign key (idmiembros) references Miembros (idmiembros);

Alter table Vuelo add constraint Vuelo_FK_Avion
Foreign key (idavion) references Avion (idavion);


Create table Regreso(
    idregreso number primary key,
    fecha date,
    hora nvarchar2(10),
    ----
    idbase number,
    idavion number,
    idpiloto number
);

Alter table Regreso add constraint Regreso_FK_Base
foreign key (idbase) references Base(idbase);

Alter table Regreso add constraint Regreso_FK_Avion
foreign key (idavion) references Avion(idavion);

Alter table Regreso add constraint Regreso_FK_Piloto
foreign key (idpiloto) references Piloto(idpiloto);

Create table Salida(
    idsalida number primary key,
    fecha date,
    hora nvarchar2(10),
    ---
    idbase number,
    idavion number,
    idpiloto number
);

Alter table Salida add constraint Salida_FK_Base
foreign key (idbase) references Base(idbase);

Alter table Salida add constraint Salida_FK_Avion
foreign key (idavion) references Avion(idavion);

Alter table Salida add constraint Salida_FK_Piloto
foreign key (idpiloto) references Piloto(idpiloto);


Create table Mantenimiento(
    idmantenimiento number primary key,
    fecha date,
    hora nvarchar2(10),
    --
    idbase number,
    idavion number,
    idpersona number
);

Alter table Mantenimiento add constraint Mantenimiento_FK_Base
foreign key (idbase) references Base(idbase);

Alter table Mantenimiento add constraint Mantenimiento_FK_Avion
foreign key (idavion) references Avion(idavion);

Alter table Mantenimiento add constraint Mantenimiento_FK_Piloto
foreign key (idpersona) references Persona(idpersona);


Create Sequence Base_SEQ;

Create or replace trigger on_insert_base before
insert on Base for each row begin
select Base_SEQ.Nextval into :new.idbase from dual;
END;

Create Sequence Avion_SEQ;

Create or replace trigger on_insert_avion before
insert on Avion for each row begin
select Avion_SEQ.Nextval into :new.idavion from dual;
END;

Create Sequence Persona_SEQ;

Create or replace trigger on_insert_persona before
insert on Persona for each row begin
select Persona_SEQ.Nextval into :new.idpersona from dual;
END;

Create Sequence Piloto_SEQ;

Create or replace trigger on_insert_piloto before
insert on Piloto for each row begin
select Piloto_SEQ.Nextval into :new.idpiloto from dual;
END;

Create Sequence Miembros_SEQ;

Create or replace trigger on_insert_miembros before
insert on Miembros for each row begin
select Miembros_SEQ.Nextval into :new.idmiembros from dual;
END;

Create Sequence Vuelo_SEQ;

Create or replace trigger on_insert_vuelo before
insert on Vuelo for each row begin
select Vuelo_SEQ.Nextval into :new.idvuelo from dual;
END;

Create Sequence Regreso_SEQ;

Create or replace trigger on_insert_regreso before
insert on Regreso for each row begin
select Regreso_SEQ.Nextval into :new.idregreso from dual;
END;

Create Sequence Salida_SEQ;

Create or replace trigger on_insert_salida before
insert on Salida for each row begin
select Salida_SEQ.Nextval into :new.idsalida from dual;
END;

Create Sequence Mantenimiento_SEQ;

Create or replace trigger on_insert_mantenimiento before
insert on Mantenimiento for each row begin
select Mantenimiento_SEQ.Nextval into :new.idmantenimiento from dual;
END;

Insert all
into Base (nombre)
values ('Leon Jaramillo')
into Base (nombre)
values ('FOL')
into Base (nombre)
values ('Moctezuma')
select * from dual;

select * from base;

Insert all
into Avion(codigo, tipo, idbase)
values ('BOING-747', 'Turista', 1)
into Avion(codigo, tipo, idbase)
values ('BOING-748', 'Carga', 2)
into Avion(codigo, tipo, idbase)
values ('BOING-749', 'Privado', 3)
select * from dual;

Select * from avion;

Insert all
into Persona (nombre)
values('Pedro')
into Persona (nombre)
values('Pica')
into Persona (nombre)
values('Piedra')
select * from dual;

select * from persona;

Insert all
into Piloto (nombre, hrs_vuelo)
values('Jacinto', 45)
into Piloto (nombre, hrs_vuelo)
values('Agripino', 20)
into Piloto (nombre, hrs_vuelo)
values('Javier', 50)
select * from dual;

select * from Piloto;

insert all
into Miembros (nombre)
values('Victor')
into Miembros (nombre)
values('Hugo')
into Miembros (nombre)
values('Salvador')
select * from dual;

Select * from miembros;

Insert all
into Vuelo (num_vuelo, origen, destino, fecha, hora, idpiloto, idmiembros, idavion)
values ('IB-8830', 'Alicante', 'Palma', '10-10-2021', '14:35:00', 1,1,1)
into Vuelo (num_vuelo, origen, destino, fecha, hora, idpiloto, idmiembros, idavion)
values ('IB-8831', 'CDMX', 'Cancun', '15-11-2021', '15:35:00', 2,2,2)
into Vuelo (num_vuelo, origen, destino, fecha, hora, idpiloto, idmiembros, idavion)
values ('IB-8833', 'Puebla', 'Toronto', '20-12-2021', '16:35:00', 3,3,3)
select * from dual;

Select * from vuelo;

Insert all
into Regreso(fecha, hora, idbase, idavion,idpiloto)
values('11-10-2021', '00:35:60', 1,1,1)
into Regreso(fecha, hora, idbase, idavion,idpiloto)
values('16-11-2021', '01:35:60', 2,2,2)
into Regreso(fecha, hora, idbase, idavion,idpiloto)
values('21-12-2021', '02:35:60', 3,3,3)
select * from dual;

select * from regreso;

insert all
into Salida (fecha, hora, idbase, idavion, idpiloto)
values('10-10-2021', '14:35:00', 1,1,1)
into Salida (fecha, hora, idbase, idavion, idpiloto)
values('15-11-2021', '15:35:00', 2,2,2)
into Salida (fecha, hora, idbase, idavion, idpiloto)
values('16-12-2021', '16:35:00', 3,3,3)
select * from dual;

select * from Salida;


insert all
into Mantenimiento(fecha, hora, idbase, idavion,idpersona)
values ('11-10-2021', '12:35:00', 1,1,1)
into Mantenimiento(fecha, hora, idbase, idavion,idpersona)
values ('16-11-2021', '13:35:00', 2,2,2)
into Mantenimiento(fecha, hora, idbase, idavion,idpersona)
values ('21-12-2021', '14:35:00', 3,3,3)
select * from dual;

select * from mantenimiento;

Commit;