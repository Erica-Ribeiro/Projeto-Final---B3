package br.com.exemplo.model;

public class ContaCliente {
	private int idCliente;
	private int idConta;
	
	public ContaCliente() {
		
	}
	
	public ContaCliente(int idCliente, int idConta) {
		super();
		this.idCliente = idCliente;
		this.idConta = idConta;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	
	public String toString() {
		return String.valueOf(idConta);
	}
}
