package Prova.MYSql;

public class mysql {
}
CREATE DATABASE sensores;
USE Sensores;
CREATE TABLE Sensor(
        id INT auto_increment PRIMARY KEY,
        codigo varchar(50) UNIQUE NOT NULL,
tipo varchar(50) NOT NULL,
localizacao varchar(50) not null,
        );

CREATE DATABASE Medidores;
USE Medidores;
CREATE TABLE Medicao(
        id INT auto_increment PRIMARY KEY,
        valorhar(50) UNIQUE NOT NULL,
unidade varchar(50) NOT NULL,
dataHora varchar(50) not null,
        );