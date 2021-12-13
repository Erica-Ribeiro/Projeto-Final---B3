create database grupo1;
use grupo1;
CREATE TABLE `clientes` (
	`idCliente` INT NOT NULL AUTO_INCREMENT,
	`nomeCliente` varchar(50) NOT NULL,
	`cpfCliente` varchar(14) NOT NULL,
	`telefoneCliente` varchar(14) NOT NULL,
	`emailCliente` varchar(60) NOT NULL,
	`contaCliente` INT NOT NULL,
	PRIMARY KEY (`idCliente`)
);

CREATE TABLE `contas` (
	`numConta` INT NOT NULL AUTO_INCREMENT,
	`ClienteTitular` varchar(50) NOT NULL,
	`agenciaConta` INT NOT NULL,
	`TipoConta` INT NOT NULL,
	`saldoConta` DOUBLE NOT NULL,
	PRIMARY KEY (`numConta`)
);

ALTER TABLE `clientes` ADD CONSTRAINT `clientes_fk0` FOREIGN KEY (`contaCliente`) REFERENCES `contas`(`numConta`);


