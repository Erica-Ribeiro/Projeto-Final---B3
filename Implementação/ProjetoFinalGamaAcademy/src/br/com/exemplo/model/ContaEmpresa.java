package br.com.exemplo.model;

public class ContaEmpresa {
	private int idEmpresa;
	private int idConta;
	
	public ContaEmpresa() {
		
	}
	
	public ContaEmpresa(int idEmpresa, int idConta) {
		super();
		this.idEmpresa = idEmpresa;
		this.idConta = idConta;
	}
	
	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
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
