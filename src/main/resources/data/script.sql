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
    valor_demais_horas int ,
    data_fim date
);

INSERT INTO tbl_valor(id, valor_primeira_hora, valor_demais_horas, data_fim)
    VALUES (1, 6.00, 4.00, null);

INSERT INTO tbl_usuario(nome, usuario, senha)
    VALUES ("admin", "admin", 123456);