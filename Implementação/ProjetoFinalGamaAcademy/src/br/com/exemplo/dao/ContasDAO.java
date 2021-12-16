package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.Contas;
import br.com.exemplo.until.ConnectionFactory;

public class ContasDAO {
	private Contas contas;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ContasDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (Contas contas) throws Exception {
		try {
			String sql = "INSERT INTO contas (titularConta, agenciaConta, numeroConta, tipoConta, saldoConta ) "
					+ " values (?, ?, ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString (1, contas.getTitularConta());
			ps.setInt (2, contas.getAgenciaConta());
			ps.setString (3, contas.getNumeroConta());
			ps.setInt (4, contas.getTipoConta());
			ps.setDouble (5, contas.getSaldoConta());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (Contas contas) throws Exception {
		try { 
			String sql = "UPDATE contas SET titularConta=?, agenciaConta=?, numeroConta=?, tipoConta=?, saldoConta=? "
					+ " WHERE idConta=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, contas.getTitularConta());
			ps.setInt (2, contas.getAgenciaConta());
			ps.setString (3, contas.getNumeroConta());
			ps.setInt (4, contas.getTipoConta());
			ps.setDouble (5, contas.getSaldoConta());
			ps.setInt (6, contas.getIdConta());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idConta) throws Exception {
		try {
			String sql = "DELETE FROM contas WHERE idConta=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idConta);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir_TodasContas (String titularConta) throws Exception {
		try {
			String sql = "DELETE FROM contas WHERE titularConta=? ";
			ps = conn.prepareStatement(sql);
			ps.setString (1, titularConta);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Contas Consultar_PorDadosConta (String titularConta, int agenciaConta, String numeroConta, int tipoConta) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM contas "
					+ " WHERE titularConta=? AND agenciaConta=? AND numeroConta=? AND tipoConta=?"); 
			ps.setString (1, titularConta);
			ps.setInt (2, agenciaConta);
			ps.setString (3, numeroConta);
			ps.setInt (4, tipoConta);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idConta = rs.getInt ("idConta");
				String titularConta2 = rs.getString ("titularConta");
				int agenciaConta2 = rs.getInt ("agenciaConta");
				String numeroConta2 = rs.getString ("numeroConta");
				int tipoConta2 = rs.getInt ("tipoConta");
				Double saldoConta = rs.getDouble ("saldoConta");
				contas = new Contas (idConta, titularConta2, agenciaConta2, numeroConta2, tipoConta2, saldoConta);
			}
				return contas;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Contas Consultar_PorDadosConta2 (String titularConta, int agenciaConta, String numeroConta) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM contas "
					+ " WHERE titularConta=? AND agenciaConta=? AND numeroConta=? "); 
			ps.setString (1, titularConta);
			ps.setInt (2, agenciaConta);
			ps.setString (3, numeroConta);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idConta = rs.getInt ("idConta");
				String titularConta2 = rs.getString ("titularConta");
				int agenciaConta2 = rs.getInt ("agenciaConta");
				String numeroConta2 = rs.getString ("numeroConta");
				int tipoConta = rs.getInt ("tipoConta");
				Double saldoConta = rs.getDouble ("saldoConta");
				contas = new Contas (idConta, titularConta2, agenciaConta2, numeroConta2, tipoConta, saldoConta);
			}
				return contas;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Contas Consultar_PorID (int idConta) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM contas "
					+ " WHERE idConta=?"); 
			ps.setInt (1, idConta);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idConta2 = rs.getInt ("idConta");
				String titularConta = rs.getString ("titularConta");
				int agenciaConta = rs.getInt ("agenciaConta");
				String numeroConta = rs.getString ("numeroConta");
				int tipoConta = rs.getInt ("tipoConta");
				Double saldoConta = rs.getDouble ("saldoConta");
				contas = new Contas (idConta2, titularConta, agenciaConta, numeroConta, tipoConta, saldoConta);
			}
				return contas;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public Contas Consultar_PorAgenciaNumero (int agenciaConta, String numeroConta) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM contas "
					+ " WHERE agenciaConta=? AND numeroConta=?"); 
			ps.setInt (1, agenciaConta);
			ps.setString (2, numeroConta);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idConta = rs.getInt ("idConta");
				String titularConta = rs.getString ("titularConta");
				int agenciaConta2 = rs.getInt ("agenciaConta");
				String numeroConta2 = rs.getString ("numeroConta");
				int tipoConta = rs.getInt ("tipoConta");
				Double saldoConta = rs.getDouble ("saldoConta");
				contas = new Contas (idConta, titularConta, agenciaConta2, numeroConta2, tipoConta, saldoConta);
			}
				return contas;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<Contas> lista = new ArrayList<Contas>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes ");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idConta = rs.getInt ("idConta");
				String titularConta = rs.getString ("titularConta");
				int agenciaConta = rs.getInt ("agenciaConta");
				String numeroConta = rs.getString ("numeroConta");
				int tipoConta = rs.getInt ("tipoConta");
				Double saldoConta = rs.getDouble ("saldoConta");
				contas = new Contas (idConta, titularConta, agenciaConta, numeroConta, tipoConta, saldoConta);
				lista.add(contas);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List Consultar_PorNomeTitular (String nomeTitular) throws Exception {
		List<Contas> lista = new ArrayList<Contas>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM contas "
					+ " WHERE titularConta=?"); 
			ps.setString (1, nomeTitular);
			rs= ps.executeQuery();
			while(rs.next()) {
				int idConta = rs.getInt ("idConta");
				String titularConta = rs.getString ("titularConta");
				int agenciaConta = rs.getInt ("agenciaConta");
				String numeroConta = rs.getString ("numeroConta");
				int tipoConta = rs.getInt ("tipoConta");
				Double saldoConta = rs.getDouble ("saldoConta");
				contas = new Contas (idConta, titularConta, agenciaConta, numeroConta, tipoConta, saldoConta);
				lista.add(contas);
			}
				return lista;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
