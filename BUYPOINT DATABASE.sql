create database sistema_ventas;
use sistema_ventas;

-- crear tabla usuarios
create table usuario(
IdUsuario int (11)  auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
usuario varchar(15) not null,
password varchar(15) not null,
telefono varchar(15) not null,
estado int(1) not null
);

insert into usuario (nombre,apellido,usuario,password,telefono, estado)
values ("Sergio","Guzman","checo","12345","4451751215",1);

select * from Reporte_Venta;
select * from Detalle_Venta;
select * from Producto;
select usuario,password from usuario where usuario = "checo" and password = "12345";

-- crear tabla cliente
create table cliente(
IdCliente int (11)  auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
cedula varchar(15) not null,
telefono varchar(15) not null,
direccion varchar(100) not null,
estado int(1) not null
);

-- crear tabla categoria
create table categoria(
IdCategoria int (11)  auto_increment primary key,
descripcion varchar(200) not null,
estado int(1) not null
);

select * from categoria where IdCategoria = 2;
select IdCategoria, descripcion, estado from categoria;
select * from Producto;
Select nombre from Producto where IdProducto = '315546';
-- crear tabla producto
create table Producto(
IdProducto varchar (20)  primary key,
nombre varchar(100) not null,
cantidad int(11) not null,
precio decimal(10,2) not null,
descripcion varchar(200) not null,
porcentajeIva int(2) not null,
IdCategoria int(11) not null,
estado int(1) not null
);

drop table Producto;

-- crear tabla Reporte de Venta
create table Reporte_Venta(
IdReporteVenta int (11)  auto_increment primary key,
IdCliente varchar(100) not null,
valorPagar decimal(10,2) not null,
fechaVenta date not null,
estado int(1) not null
);

-- crear tabla Detalle de Venta
create table Detalle_Venta(
IdDetalleVenta int (11)  auto_increment primary key,
IdReporteVenta int(11) not null,
IdProducto int(11) not null,
cantidad int(11) not null,
precioUnitario decimal(10,2) not null,
subtotal decimal(10,2) not null,
descuento decimal(10,2) not null,
iva decimal(10,2) not null,
totalPagar decimal(10,2) not null,
estado int(1) not null
);
select * from Detalle_Venta;
select * from Reporte_Venta;
show tables;

select rv.IdReporteVenta, rv.IdCLiente, concat(c.nombre, ' ',c.apellido) as cliente, rv.valorPagar, rv.fechaVenta, rv.estado from Reporte_Venta as rv, cliente as c where rv.IdReporteVenta = 3 and rv.IdCliente = c.IdCliente;

select rv.IdReporteVenta as id, concat(c.nombre, ' ',c.apellido) as cliente, rv.valorPagar as total, rv.fechaVenta as fecha, rv.estado from Reporte_Venta as rv, cliente as c where rv.IdCliente = c.IdCliente;

GRANT SELECT, INSERT, UPDATE, DELETE
ON checo.producto
TO 'Alonso'@'%';

SHOW GRANTS FOR CURRENT_USER();

DROP TABLE cliente;

ALTER TABLE Reporte_Venta
DROP COLUMN IdCliente;

SHOW TABLES;
