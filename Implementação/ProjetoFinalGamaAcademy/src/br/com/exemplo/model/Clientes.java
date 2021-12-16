package br.com.exemplo.model;

public class Clientes {
	private int idCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String celularCliente;
	private String emailCliente;
	
	public Clientes () {
		
	}
	
	public Clientes(int idCliente, String nomeCliente, String cpfCliente, String celularCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.celularCliente = celularCliente;
		this.emailCliente = emailCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	public String toString() {
		return nomeCliente;
	}
}
