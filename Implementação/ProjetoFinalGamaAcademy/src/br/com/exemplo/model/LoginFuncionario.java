package br.com.exemplo.model;

public class LoginFuncionario {
	private int codFuncionario;
	private int senha;
	
	public LoginFuncionario() {
		
	}

	public LoginFuncionario(int codFuncionario, int senha) {
		super();
		this.codFuncionario = codFuncionario;
		this.senha = senha;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String toString() {
		return String.valueOf(codFuncionario);
	}
}

