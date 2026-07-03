CREATE DATABASE gerenciamento;
USE Gerenciamento;
CREATE TABLE sensor (
    id INT AUTO_INCREMENT KEY,
    codigo VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    localizacao VARCHAR(100) NOT NULL
);
CREATE TABLE medicao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    valor VARCHAR(50) NOT NULL,
    unidade VARCHAR(20) NOT NULL,
    dataHora VARCHAR(50) NOT NULL,
    sensorId INT NOT NULL,
    FOREIGN KEY (sensorId) REFERENCES sensor(id)

);