create table if not exists `product`(
id int auto_increment primary key,
nome varchar(60) not null,
vlr_unitario decimal(10,4) not null,
quantidade tinyint not null,
categoria enum('COMPUTADOR', 'CELULAR','PERIFERICO','ELETRODOMESTICO'),
img_url text(500)  not null
);
create table if not exists `address`(
id_endereco int auto_increment primary key,
bairro varchar(30),
logradouro varchar(60),
uf varchar(5)
);
create table if not exists `user`(
id int auto_increment primary key,
nome varchar(60) not null,
cpf char(11) not null unique, 
email varchar(100) not null,
senha varchar(15) not null,
gender CHAR(1),
id_endereco int,
foreign key(id_endereco) references endereco(id_endereco)
);