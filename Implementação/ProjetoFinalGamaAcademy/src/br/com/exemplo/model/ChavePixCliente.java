package br.com.exemplo.model;

public class ChavePixCliente {
	private int idChavePix;
	private String tipoChavePix;
	private String chavePix;
	private String cpfCliente;
	
	public ChavePixCliente() {
		
	}

	public ChavePixCliente(int idChavePix, String tipoChavePix, String chavePix, String cpfCliente) {
		super();
		this.idChavePix = idChavePix;
		this.tipoChavePix = tipoChavePix;
		this.chavePix = chavePix;
		this.cpfCliente = cpfCliente;
	}

	public int getIdChavePix() {
		return idChavePix;
	}

	public void setIdChavePix(int idChavePix) {
		this.idChavePix = idChavePix;
	}

	public String getTipoChavePix() {
		return tipoChavePix;
	}

	public void setTipoChavePix(String tipoChavePix) {
		this.tipoChavePix = tipoChavePix;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public String toString() {
		return tipoChavePix;
	}
}
