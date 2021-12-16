package br.com.exemplo.model;

public class Contas {
	private int idConta;
	private String titularConta;
	private int agenciaConta;
	private String numeroConta;
	private int tipoConta;
	private String tipo;
	private double saldoConta;
	
	public Contas() {
		
	}
	
	public Contas(int idConta, String titularConta, int agenciaConta, String numeroConta, int tipoConta,
			double saldoConta) {
		super();
		this.idConta = idConta;
		this.titularConta = titularConta;
		this.agenciaConta = agenciaConta;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.saldoConta = saldoConta;
	}
	
	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public int getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(int agenciaConta) {
		this.agenciaConta = agenciaConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public String toString() {
		return titularConta;
	}
}
