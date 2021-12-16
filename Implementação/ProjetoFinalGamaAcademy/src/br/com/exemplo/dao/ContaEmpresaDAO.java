package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.ContaEmpresa;
import br.com.exemplo.until.ConnectionFactory;

public class ContaEmpresaDAO {
	private ContaEmpresa contaEmpresa;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ContaEmpresaDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (ContaEmpresa contaEmpresa) throws Exception {
		try {
			String sql = "INSERT INTO contaEmpresa (idEmpresa, idConta ) "
					+ " values (?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, contaEmpresa.getIdEmpresa());
			ps.setInt (2, contaEmpresa.getIdConta());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (ContaEmpresa contaEmpresa) throws Exception {
		try { 
			String sql = "UPDATE contaEmpresa SET idConta=? "
					+ " WHERE idEmpresa=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, contaEmpresa.getIdConta());
			ps.setInt (2, contaEmpresa.getIdEmpresa());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idEmpresa) throws Exception {
		try {
			String sql = "DELETE FROM contaEmpresa WHERE idEmpresa=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idEmpresa);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public ContaEmpresa Consultar_PorID (int idEmpresa) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM contaEmpresa "
					+ " WHERE idEmpresa=?"); 
			ps.setInt (1, idEmpresa);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idEmpresa2 = rs.getInt ("idEmpresa");
				int idConta = rs.getInt ("idConta");
				contaEmpresa = new ContaEmpresa (idEmpresa2, idConta);
			}
				return contaEmpresa;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<ContaEmpresa> lista = new ArrayList<ContaEmpresa>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM contaEmpresa");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idEmpresa = rs.getInt ("idEmpresa");
				int idConta = rs.getInt ("idConta");
				contaEmpresa = new ContaEmpresa (idEmpresa, idConta);
				lista.add(contaEmpresa);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
