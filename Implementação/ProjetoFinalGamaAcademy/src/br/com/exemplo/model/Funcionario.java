package br.com.exemplo.model;

public class Funcionario {
	private int codFuncionario;
	private String nomeFuncionario;
	private String cpfFuncionario;
	private String emailFuncionario;
	private String celularFuncionario;
	
	public Funcionario() {
		
	}

	public Funcionario(int codFuncionario, String nomeFuncionario, String cpfFuncionario, String emailFuncionario,
			String celularFuncionario) {
		super();
		this.codFuncionario = codFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.emailFuncionario = emailFuncionario;
		this.celularFuncionario = celularFuncionario;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public String getCelularFuncionario() {
		return celularFuncionario;
	}

	public void setCelularFuncionario(String celularFuncionario) {
		this.celularFuncionario = celularFuncionario;
	}
	
	public String toString() {
		return nomeFuncionario;
	}
}
