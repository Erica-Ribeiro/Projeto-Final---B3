package br.com.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.model.LoginCliente;
import br.com.exemplo.until.ConnectionFactory;

public class LoginClienteDAO {
	private LoginCliente loginCliente;
	private Connection conn; 
	private PreparedStatement ps;
	private ResultSet rs;
	
	public LoginClienteDAO() throws Exception {
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception erro) {
			throw new Exception ("Erro: " + erro.getMessage());
		}
	}
	public void Salvar (LoginCliente loginCliente) throws Exception {
		try {
			String sql = "INSERT INTO loginCliente (idCliente, senha ) "
					+ " values (?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, loginCliente.getIdCliente());
			ps.setInt (2, loginCliente.getSenha());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Alterar (LoginCliente loginCliente) throws Exception {
		try { 
			String sql = "UPDATE loginCliente SET senha=? "
					+ " WHERE idCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, loginCliente.getSenha());
			ps.setInt (2, loginCliente.getIdCliente());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public void Excluir (int idCliente) throws Exception {
		try {
			String sql = "DELETE FROM loginCliente WHERE idCliente=? ";
			ps = conn.prepareStatement(sql);
			ps.setInt (1, idCliente);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public LoginCliente Consultar_PorIdCliente (int idCliente) throws Exception {
		try {
			ps = conn.prepareStatement ("SELECT * FROM loginCliente "
					+ " WHERE idCliente=? "); 
			ps.setInt (1, idCliente);
			rs= ps.executeQuery();
			if(rs.next()) {
				int idCliente2 = rs.getInt ("idCliente");
				int senha = rs.getInt ("senha");
				loginCliente = new LoginCliente (idCliente2, senha);
			}
				return loginCliente;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
	public List ListarTodos() throws Exception {
		List<LoginCliente> lista = new ArrayList<LoginCliente>();
		try {
			ps = conn.prepareStatement ("SELECT * FROM loginCliente");
			rs = ps.executeQuery();
			while (rs.next()) {
				int idCliente = rs.getInt ("idCliente");
				int senha = rs.getInt ("senha");
				loginCliente = new LoginCliente (idCliente, senha);
				lista.add(loginCliente);
			}
			return lista;
		}catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}
}
