/*este script faz a correção do erro de chave estrangeira do sql do grupo 1*/
Create database SolutionTech;
USE SolutionTech;
CREATE TABLE `clientes` (
	`idCliente` INT AUTO_INCREMENT,
	`nomeCliente` varchar(50) NOT NULL,
	`cpfCliente` varchar(14) NOT NULL,
	`telefoneCliente` varchar(14) NOT NULL,
	`emailCliente` varchar(60) NOT NULL,
	PRIMARY KEY (`idCliente`)
);

CREATE TABLE `contas` (
	`numConta` INT NOT NULL AUTO_INCREMENT,
	`ClienteTitular` varchar(50) NOT NULL,
	`agenciaConta` INT NOT NULL,
	`TipoConta` INT NOT NULL,
	`saldoConta` DOUBLE NOT NULL,
	`clienteConta` INT NOT NULL,
	PRIMARY KEY (`numConta`)
);

ALTER TABLE `contas` ADD CONSTRAINT `contas_fk0` FOREIGN KEY (`clienteConta`) REFERENCES `clientes`(`idCliente`);