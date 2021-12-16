package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.ContaCliente;
import br.com.exemplo.until.ConnectionFactory;

public class ContaClienteDAO {
	private ContaCliente contaCliente;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ContaClienteDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (ContaCliente contaCliente) throws Exception {
		try {
			String sql = "INSERT INTO contaCliente (idCliente, idConta ) "
					+ " values (?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, contaCliente.getIdCliente());
			ps.setInt (2, contaCliente.getIdConta());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (ContaCliente contaCliente) throws Exception {
		try { 
			String sql = "UPDATE contaCliente SET idConta=? "
					+ " WHERE idCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, contaCliente.getIdConta());
			ps.setInt (2, contaCliente.getIdCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir_PorID (int idCliente) throws Exception {
		try {
			String sql = "DELETE FROM contaCliente WHERE idCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idCliente);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir_PorIDConta (int idCliente, int idConta) throws Exception {
		try {
			String sql = "DELETE FROM contaCliente WHERE idCliente=? AND idConta=?";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idCliente);
			ps.setInt (2, idConta);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public ContaCliente Consultar_PorID (int idCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM contaCliente "
					+ " WHERE idCLiente=?"); 
			ps.setInt (1, idCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idCliente2 = rs.getInt ("idCliente");
				int idConta = rs.getInt ("idConta");
				contaCliente = new ContaCliente (idCliente2, idConta);
			}
				return contaCliente;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<ContaCliente> lista = new ArrayList<ContaCliente>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM clientes");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idCliente = rs.getInt ("idCliente");
				int idConta = rs.getInt ("idConta");
				contaCliente = new ContaCliente (idCliente, idConta);
				lista.add(contaCliente);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
