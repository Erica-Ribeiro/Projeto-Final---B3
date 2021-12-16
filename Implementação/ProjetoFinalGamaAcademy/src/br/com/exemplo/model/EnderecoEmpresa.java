package br.com.exemplo.model;

public class EnderecoEmpresa {
	private int idEndereco;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public EnderecoEmpresa() {
		
	}

	public EnderecoEmpresa(int idEndereco, String endereco, int numero, String bairro, String cidade, String estado) {
		super();
		this.idEndereco = idEndereco;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		return endereco;
	}
}
