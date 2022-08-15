--ex1
DROP table IF EXISTS fabricantes;
create table fabricantes(
id int auto_increment,
nombre varchar(100),
PRIMARY KEY (id)
);
DROP table IF EXISTS articulos;
create table articulos(
id int auto_increment,
nombre varchar(100),
precio int,
fabricante int,
PRIMARY KEY(id),
FOREIGN KEY(fabricante) REFERENCES fabricantes (id)
);
insert into fabricantes(nombre) values('fab1');
insert into fabricantes(nombre) values('fab2');
insert into fabricantes(nombre) values('fab3');
insert into fabricantes(nombre) values('fab4');
insert into fabricantes(nombre) values('fab5');
insert into articulos(nombre, precio, fabricante) values('tg1', 111, 1);
insert into articulos(nombre, precio, fabricante) values('tg2', 222, 2);
insert into articulos(nombre, precio, fabricante) values('tg3', 333, 3);
insert into articulos(nombre, precio, fabricante) values('tg4', 444, 4);
insert into articulos(nombre, precio, fabricante) values('tg5', 555, 5);

--ex2
DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;
CREATE TABLE Departamentos(
codigo int,
nombre nvarchar(100),
presupuesto int,
PRIMARY KEY(codigo)
);
CREATE TABLE Empleados(
dni varchar(9),
nombre nvarchar(100),
apellidos nvarchar(255),
departamento int,
PRIMARY KEY (dni),
FOREIGN KEY (departamento) REFERENCES Departamentos(codigo)
);
INSERT INTO Departamentos(codigo, nombre, presupuesto) VALUES(1, 'Dp1', 260);
INSERT INTO Departamentos(codigo, nombre, presupuesto) VALUES(2, 'Dp2', 550);
INSERT INTO Departamentos(codigo, nombre, presupuesto) VALUES(3, 'Dp3', 300);
INSERT INTO Empleados(dni, nombre, apellidos, departamento) VALUES('399', 'Arnau', 'Mas', 1);
INSERT INTO Empleados(dni, nombre, apellidos, departamento) VALUES('778', 'Juan', 'Marin', 2);

--ex3
DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;
create TABLE almacenes(
	codigo int auto_increment PRIMARY KEY,
	lugar varchar(100),
	capacidad int
);
create table cajas(
	num_ref varchar(5) PRIMARY KEY,
	valor int,
	contenido varchar(100),
	codigo_almacen int,
	FOREIGN KEY(codigo_almacen) REFERENCES almacenes(codigo)
);
INSERT INTO almacenes(lugar, capacidad) values('AL1',10);
INSERT INTO almacenes(lugar, capacidad) values('AL2',20);
INSERT INTO almacenes(lugar, capacidad) values('AL3',30);
INSERT INTO almacenes(lugar, capacidad) values('AL4',40);
INSERT INTO almacenes(lugar, capacidad) values('AL5',50);
INSERT INTO cajas(num_ref, valor, contenido, codigo_almacen) values('AB122',10,'perfil',1);
INSERT INTO cajas(num_ref, valor, contenido, codigo_almacen) values('CD456',20,'kit',1);
INSERT INTO cajas(num_ref, valor, contenido, codigo_almacen) values('EF789',30,'brazo',2);
INSERT INTO cajas(num_ref, valor, contenido, codigo_almacen) values('GH123',40,'motor',2);
INSERT INTO cajas(num_ref, valor, contenido, codigo_almacen) values('IJ456',50,'panel',3);

--ex4
DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;
CREATE TABLE peliculas(
id int NOT NULL AUTO_INCREMENT,
nombre varchar(20),
clasificacion_edad int,
PRIMARY KEY(id)
);

CREATE TABLE salas(
id int NOT NULL AUTO_INCREMENT,
nombre varchar(20),
pelicula int,
PRIMARY KEY(id),
CONSTRAINT FK_Salas_pelicula FOREIGN KEY(pelicula) REFERENCES peliculas(id)
);

INSERT INTO peliculas (nombre, clasificacion_edad) VALUES ('300', 2);
INSERT INTO peliculas (nombre, clasificacion_edad) VALUES ('Gladiator', 1);
INSERT INTO peliculas (nombre, clasificacion_edad) VALUES ('Sonrisas y lagrimas', 3);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala1', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala2', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala3', 3);