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

-- crear tabla producto
create table Producto(
IdProducto int (11)  auto_increment primary key,
nombre varchar(100) not null,
cantidad int(11) not null,
precio decimal(10,2) not null,
descripcion varchar(200) not null,
porcentajeIva int(2) not null,
IdCategoria int(11) not null,
estado int(1) not null
);



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

show tables;
