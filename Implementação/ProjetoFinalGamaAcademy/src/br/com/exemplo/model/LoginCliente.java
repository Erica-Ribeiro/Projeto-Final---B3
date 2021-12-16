package br.com.exemplo.model;

public class LoginCliente {
	private int idCliente;
	private int senha;
	
	public LoginCliente() {
		
	}

	public LoginCliente(int idCliente, int senha) {
		super();
		this.idCliente = idCliente;
		this.senha = senha;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String toString() {
		return String.valueOf(idCliente);
	}
}
