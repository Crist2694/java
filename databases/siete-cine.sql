-- ejercicio 7

Create table Cine(
    idcine number primary key,
    nombre nvarchar2(10),
    calle nvarchar2(50),
    numero nvarchar2(10),
    --
    idtarifa number
);

Create table Tarifa(
    idtarifa number primary key,
    dia nvarchar2(10),
    precio number    
);

select * from tarifa;

alter table Cine add constraint Cine_FK_Tarifa
foreign key (idtarifa) references Tarifa(idtarifa);

Create table Pelicula(
    idpelicula number primary key,
    nombre nvarchar2(50),
    horario_pases nvarchar2(50),
    director nvarchar2(50),
    protagonistas nvarchar2(100),
    genero nvarchar2(20)
);

Create table Transmision(
    idtransmision number primary key,
    horario nvarchar2(20),
    sala nvarchar2(20),
    --
    idcine number,
    idpelicula number
);

alter table Transmision add constraint Cine_FK_Transmision
foreign key (idcine) references Cine(idcine);
alter table Transmision add constraint Pelicula_FK_Transmision
foreign key (idpelicula) references Pelicula(idpelicula);

---

Create sequence Cine_SEQ;

Create or replace trigger on_Insert_Cine before
insert on Cine for each row begin
Select Cine_SEQ.nextval into :new.idcine from dual;
end;

Create sequence Tarifa_SEQ;

Create or replace trigger on_Insert_Tarifa before
insert on Tarifa for each row begin
Select Tarifa_SEQ.nextval into :new.idtarifa from dual;
END;

Create sequence Peliculas_SEQ;

Create or replace trigger on_Insert_peliculaa before
insert on Pelicula for each row begin
Select Peliculas_SEQ.nextval into :new.idpelicula from dual;
END;

Create sequence Transmision_SEQ;

Create or replace trigger on_Insert_transmision before
insert on Transmision for each row begin
Select Transmision_SEQ.nextval into :new.idtransmision from dual;
END;



insert all
into Tarifa(dia, precio)
values('espectador', 32.5)
into Tarifa(dia, precio)
values('jubilado', 22)
into Tarifa(dia, precio)
values('festivo', 50)
into Tarifa(dia, precio)
values('estudiante', 25)
select * from dual;

select * from tarifa;
commit;

Insert all
into Cine(nombre, calle, numero, idtarifa)
values('Continente', 'hermenegildo', '15-d', 21 )
into Cine(nombre, calle, numero, idtarifa)
values('Colonial', '14 poniente', '12', 22 )
into Cine(nombre, calle, numero, idtarifa)
values('boulevard', '5 de mayo', '10', 23 )
into Cine(nombre, calle, numero, idtarifa)
values('Cristal', 'Juan plablo II', '204', 24 )
select * from dual;

select * from Cine;
commit;

Insert all
into Pelicula(nombre, horario_pases, director, protagonistas, genero)
values('Matrix', '12:00 - 17:00', 'Lana Wachowski', 'Kanu Reaves', 'Ciencia ficción')
into Pelicula(nombre, horario_pases, director, protagonistas, genero)
values('Clifford', '12:00 - 17:00', ' Walt Becker', 'Clifford', 'Infantil')
into Pelicula(nombre, horario_pases, director, protagonistas, genero)
values('Lamb', '12:00 - 17:00', 'Valdimar Johannsson', 'Sigurjón Birgir Sigurðsson', 'Terror')
into Pelicula(nombre, horario_pases, director, protagonistas, genero)
values('Karem', '12:00 - 17:00', 'Karem Johannsson', 'Karem Sigurðsson', 'Terror')
select * from dual;

select * from Pelicula;

Insert all
into Transmision( horario, sala, idcine,idpelicula)
values('12:00', 'A1', 23, 21)
into Transmision( horario, sala, idcine,idpelicula)
values('13:00', 'B2', 24, 22)
into Transmision( horario, sala, idcine,idpelicula)
values('14:00', 'C3', 25, 23)
into Transmision( horario, sala, idcine,idpelicula)
values('15:00', 'D4', 26, 24)
select * from dual;

select * from transmision;

Select nombre as cine, dia as "Tipo de dia", precio as costo
from Cine c, Tarifa  t
where c.idcine=t.idtarifa;


Select p.nombre as pelicula, p.director, p.protagonistas, p.genero, trans.horario, trans.sala, c.nombre as Cine, t.precio  
from Cine c, Tarifa t, Transmision trans, Pelicula p
where c.idcine=t.idtarifa and c.idcine=trans.idcine and trans.idpelicula=p.idpelicula;

commit;
