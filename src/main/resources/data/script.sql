create database sistema_estacionamento;

create table tbl_usuario(
    id int not null auto_increment primary key, 
    nome varchar(40),
    usuario varchar(40),
    senha varchar(10)
);

create table tbl_movimentacao(
    id int not null auto_increment primary key,
    placa varchar(7),
    modelo varchar(40),
    data_entrada date,
    data_saida date,
    tempo float,
    valor_pago int
);

create table tbl_valor(
    id int not null auto_increment primary key, 
    valor_primeira_hora int,
    valor_demais int ,
    horas int,
    data_fim date
);