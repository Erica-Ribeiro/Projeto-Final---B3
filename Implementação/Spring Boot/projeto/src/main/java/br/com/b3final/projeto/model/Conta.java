package br.com.b3final.projeto.model;

//importando as anotações necessarias para realizar a conexão dos campos da tabela
import javax.persistence.*;


//Na anotação abaixo diz a classe conta será armazenada e recuperada na tabela
@Entity
@Table(name="tbconta")
public class Conta {

//indica que o atributo indicado é a chave primária
@Id

//Criando o tipo de dados correspondente a nossa tabela de conta
@Column(name="numero")
private int numero;

@Column(name="agencia")
private int agencia;

@Column(name="tipo")
private int tipo;

@Column(name="saldo")
private int saldo;

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public int getSaldo() {
	return saldo;
}

public void setSaldo(int saldo) {
	this.saldo = saldo;
}


}