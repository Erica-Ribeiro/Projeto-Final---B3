package br.com.exemplo.model;

import java.sql.Date;

public class Extrato {
	private int idExtrato;
	private String dataTransacao;
	private String tipo;
	private String descricao;
	private Double valor;
	private Double saldoData;
	private int idCliente;
	
	public Extrato() {
		
	}

	public Extrato(int idExtrato, String dataTransacao, String tipo, String descricao, Double valor, Double saldoData,
			int idCliente) {
		super();
		this.idExtrato = idExtrato;
		this.dataTransacao = dataTransacao;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
		this.saldoData = saldoData;
		this.idCliente = idCliente;
	}

	public int getIdExtrato() {
		return idExtrato;
	}

	public void setIdExtrato(int idExtrato) {
		this.idExtrato = idExtrato;
	}

	public String getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getSaldoData() {
		return saldoData;
	}

	public void setSaldoData(Double saldoData) {
		this.saldoData = saldoData;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String toString() {
		return tipo;
	}
	
}
