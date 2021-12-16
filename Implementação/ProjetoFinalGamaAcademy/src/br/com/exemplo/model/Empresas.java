package br.com.exemplo.model;

public class Empresas {
	private int idEmpresa;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String inscricaoEstadual;
	private String telefoneEmpresa;
	private String celularEmpresa;
	private String emailEmpresa;
	private int idEndereco;
	
	public Empresas() {
		
	}

	public Empresas(int idEmpresa, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual,
			String telefoneEmpresa, String celularEmpresa, String emailEmpresa, int idEndereco) {
		super();
		this.idEmpresa = idEmpresa;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telefoneEmpresa = telefoneEmpresa;
		this.celularEmpresa = celularEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.idEndereco = idEndereco;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}
	
	public String getCelularEmpresa() {
		return celularEmpresa;
	}

	public void setCelularEmpresa(String celularEmpresa) {
		this.celularEmpresa = celularEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	
	public String toString() {
		return razaoSocial;
	}
}
